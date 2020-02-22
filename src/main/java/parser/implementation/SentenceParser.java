package parser.implementation;

import composite.ComponentType;
import composite.TextComposite;
import parser.TextParser;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class SentenceParser implements TextParser {

    private static final String SENTENCE_REGEX = "([^.!?]+[.{1,3}!?][\\s\\n]*)";
    private TextParser nextParser;

    public SentenceParser(TextParser nextParser) {
        this.nextParser = nextParser;
    }

    @Override
    public TextComposite parse(TextComposite composite, String textToParse) {

        Pattern pattern = Pattern.compile(SENTENCE_REGEX);
        Matcher matcher = pattern.matcher(textToParse);

        TextComposite sentence;
        while (matcher.find()) {
            sentence = new TextComposite(ComponentType.SENTENCE);
            sentence = nextParser.parse(sentence, matcher.group());
            composite.addComponent(sentence);
        }
        return composite;
    }
}
