package parser;

import entity.ComponentType;
import entity.TextComponent;
import entity.TextComposite;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class ParagraphParser implements TextParser {

    private static final String PARAGRAPH_REGEX = "(.*[^\\n])(\\n*)";
    private TextParser nextParser;

    public ParagraphParser(TextParser nextParser) {
        this.nextParser = nextParser;
    }

    @Override
    public TextComposite parse(TextComposite composite, String textToParse) {
        Pattern pattern = Pattern.compile(PARAGRAPH_REGEX);
        Matcher matcher = pattern.matcher(textToParse);

        TextComposite paragraph;
        while (matcher.find()){
            paragraph = new TextComposite(ComponentType.PARAGRAPH);
            paragraph = nextParser.parse(paragraph, matcher.group());
            composite.addComponent(paragraph);
        }
        return composite;
    }
}
