package parser;

import entity.TextComponent;

public class ParagraphParser implements TextParser {

    private static final String PARAGRAPH_REGEX = ".*[^\\n]";
    private TextParser nextParser;

    public ParagraphParser(TextParser nextParser) {
        this.nextParser = nextParser;
    }

    @Override
    public TextComponent parse(String componentToParse) {
        return null;
    }
}
