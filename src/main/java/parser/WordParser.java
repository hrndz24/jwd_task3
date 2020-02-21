package parser;

import entity.TextComponent;
import entity.TextComposite;

public class WordParser implements TextParser {
    private static final String WORD_REGEX = "([A-Za-z\\d-'()\"]+)";
    private TextParser nextParser;

    public WordParser(TextParser nextParser) {
        this.nextParser = nextParser;
    }

    @Override
    public TextComponent parse(TextComposite composite, String textToParse) {
        return null;
    }
}
