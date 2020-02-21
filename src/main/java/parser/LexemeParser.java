package parser;

import entity.TextComponent;
import entity.TextComposite;

public class LexemeParser implements TextParser {

    private static final String LEXEME_REGEX = "([^(\\s)]*)(\\s)*";
    private TextParser nextParser;

    public LexemeParser(TextParser nextParser) {
        this.nextParser = nextParser;
    }

    @Override
    public TextComponent parse(TextComposite component, String textToParse) {
        return null;
    }
}
