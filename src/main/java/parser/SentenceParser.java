package parser;

import entity.TextComponent;
import entity.TextComposite;

public class SentenceParser implements TextParser {

    private static final String SENTENCE_REGEX = "([^(\\.|\\!|\\?]+)(\\.{1,3}|!|\\?)";
    private TextParser nextParser;

    public SentenceParser(TextParser nextParser) {
        this.nextParser = nextParser;
    }

    @Override
    public TextComponent parse(TextComposite composite, String textToParse) {
        return null;
    }
}
