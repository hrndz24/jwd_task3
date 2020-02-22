package parser.implementation;

import composite.ComponentType;
import composite.TextComposite;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

public class LexemeParserTest {

    private LexemeParser lexemeParser;

    @Before
    public void init() {
        this.lexemeParser = new LexemeParser(new WordParser(new SymbolParser()));
    }

    @Test
    public void parse() {
        String sentence = "Hello (from) the, other side";
        TextComposite sentenceComposite = new TextComposite(ComponentType.SENTENCE);
        lexemeParser.parse(sentenceComposite, sentence);
        int expected = 5;
        int actual = sentenceComposite.getComponents().size();
        Assert.assertEquals(expected, actual);
    }
}