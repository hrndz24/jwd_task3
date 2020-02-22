package parser.implementation;

import composite.ComponentType;
import composite.TextComposite;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

public class SentenceParserTest {

    private SentenceParser sentenceParser;

    @Before
    public void init() {
        this.sentenceParser = new SentenceParser(new LexemeParser(new WordParser(new SymbolParser())));
    }

    @Test
    public void parse() {
        String paragraph = "Hello from the other side! I must have called a thousand times.";
        TextComposite paragraphComposite = new TextComposite(ComponentType.PARAGRAPH);
        sentenceParser.parse(paragraphComposite, paragraph);
        int expected = 2;
        int actual = paragraphComposite.getComponents().size();
        Assert.assertEquals(expected, actual);
    }
}