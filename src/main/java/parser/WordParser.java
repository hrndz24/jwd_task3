package parser;


import entity.ComponentType;
import entity.TextComposite;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class WordParser implements TextParser {
    private static final String WORD_REGEX = "([\\w]+)(\\W*)";
    private TextParser nextParser;

    public WordParser(TextParser nextParser) {
        this.nextParser = nextParser;
    }

    @Override
    public TextComposite parse(TextComposite composite, String textToParse) {

        Pattern pattern = Pattern.compile(WORD_REGEX);
        Matcher matcher = pattern.matcher(textToParse);

        while (matcher.find()){
            TextComposite word = new TextComposite(ComponentType.WORD);
            word = nextParser.parse(word, matcher.group());
            composite.addComponent(word);
        }
        return composite;
    }
}
