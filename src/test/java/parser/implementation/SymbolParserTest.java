package parser.implementation;

import composite.ComponentType;
import composite.TextComposite;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

public class SymbolParserTest {

    private SymbolParser symbolParser;

    @Before
    public void init(){
        this.symbolParser = new SymbolParser();
    }
    @Test
    public void parseSimpleWord(){
        String word = "word";
        TextComposite wordComposite = new TextComposite(ComponentType.WORD);
        symbolParser.parse(wordComposite, word);
        int expected = word.length();
        int actual = wordComposite.getComponents().size();
        Assert.assertEquals(expected, actual);
    }

    @Test
    public void parseCompoundWord() {
        String word = "ice-cream";
        TextComposite wordComposite = new TextComposite(ComponentType.WORD);
        symbolParser.parse(wordComposite, word);
        int expected = word.length();
        int actual = wordComposite.getComponents().size();
        Assert.assertEquals(expected, actual);
    }
}