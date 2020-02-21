package parser;

import entity.TextComponent;

public class LexemeParser implements TextParser {

    private static final String LEXEME_REGEX = "([^(\\s)]*)(\\s)*";
    private TextParser nextParser;

    public LexemeParser(TextParser nextParser) {
        this.nextParser = nextParser;
    }

    @Override
    public TextComponent parse(TextComponent component, String textToParse) {
        return null;
    }
}
