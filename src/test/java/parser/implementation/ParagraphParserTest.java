package parser.implementation;

import composite.ComponentType;
import composite.TextComposite;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

public class ParagraphParserTest {

    private ParagraphParser paragraphParser;

    @Before
    public void init() {
        this.paragraphParser = new ParagraphParser(new SentenceParser(new LexemeParser(new WordParser(new SymbolParser()))));
    }

    @Test
    public void parse() {
        String text = "Nice text.\n Couldn't be nicer!";
        TextComposite textComposite = new TextComposite(ComponentType.TEXT);
        paragraphParser.parse(textComposite, text);
        int expected = 2;
        int actual = textComposite.getComponents().size();
        Assert.assertEquals(expected, actual);
    }
}