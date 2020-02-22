package parser;

import entity.ComponentType;
import entity.TextComposite;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class LexemeParser implements TextParser {

    private static final String LEXEME_REGEX = "([^\\s]*)([\\s|\\n]*)";
    private TextParser nextParser;

    public LexemeParser(TextParser nextParser) {
        this.nextParser = nextParser;
    }

    @Override
    public TextComposite parse(TextComposite composite, String textToParse) {

        Pattern pattern = Pattern.compile(LEXEME_REGEX);
        Matcher matcher = pattern.matcher(textToParse);

        while (matcher.find()){
            TextComposite lexeme = new TextComposite(ComponentType.LEXEME);
            lexeme = nextParser.parse(lexeme, matcher.group());
            System.out.println(matcher.group());
            composite.addComponent(lexeme);
        }
        return composite;
    }
}
