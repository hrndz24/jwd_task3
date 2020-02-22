package parser;

import composite.ComponentType;
import composite.TextComposite;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class ExpressionParser implements TextParser {

    public static final String EXPRESSION_REGEX ="";
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
            // TODO: 22.02.2020 calculate
            int expressionValue =0 ;
            textToParse = matcher.replaceAll(String.valueOf(expressionValue));
        }
        TextComposite text = new TextComposite(ComponentType.TEXT);
        text = nextParser.parse(text, textToParse);
        composite.addComponent(text);
        return composite;
    }
}
