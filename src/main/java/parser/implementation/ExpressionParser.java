package parser.implementation;

import composite.ComponentType;
import composite.TextComposite;
import parser.TextParser;
import util.ReversePolishNotationCalculator;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class ExpressionParser implements TextParser {

    public static final String EXPRESSION_REGEX ="(?m)(~|~\\(*|\\(*~|\\()?\\d+(\\.\\d+)?(( *\\)* *)([-+*/&|^]|<<|>>) *~* *\\(* *~* *\\d+(\\.\\d+)?\\)*)+";
    private TextParser nextParser;

    public ExpressionParser(TextParser nextParser) {
        this.nextParser = nextParser;
    }

    @Override
    public TextComposite parse(TextComposite composite, String textToParse) {
        Pattern pattern = Pattern.compile(EXPRESSION_REGEX);
        Matcher matcher = pattern.matcher(textToParse);

        while (matcher.find()){
            String expressionString = matcher.group();
            int expressionValue =new ReversePolishNotationCalculator().calculate(expressionString);
            textToParse = textToParse.replace(expressionString, String.valueOf(expressionValue));
        }
        TextComposite text = new TextComposite(ComponentType.TEXT);
        text = nextParser.parse(text, textToParse);
        composite.addComponent(text);
        return composite;
    }
}
