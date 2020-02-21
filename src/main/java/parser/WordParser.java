package parser;

import entity.TextComponent;

public class WordParser implements TextParser {
    private static final String WORD_REGEX = "([A-Za-z\\d-'()\"]+)";
    private TextParser nextParser;

    public WordParser(TextParser nextParser) {
        this.nextParser = nextParser;
    }

    @Override
    public TextComponent parse(String componentToParse) {
        return null;
    }
}
