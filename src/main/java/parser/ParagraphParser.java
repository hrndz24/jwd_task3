package parser;

import entity.TextComponent;
import entity.TextComposite;

public class ParagraphParser implements TextParser {

    private static final String PARAGRAPH_REGEX = ".*[^\\n]";
    private TextParser nextParser;

    public ParagraphParser(TextParser nextParser) {
        this.nextParser = nextParser;
    }

    @Override
    public TextComponent parse(TextComposite composite, String textToParse) {
        return null;
    }
}
