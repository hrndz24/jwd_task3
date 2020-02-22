package parser.implementation;

import composite.ComponentType;
import composite.TextComposite;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

public class WordParserTest {

    private WordParser wordParser;

    @Before
    public void init() {
        this.wordParser = new WordParser(new SymbolParser());
    }

    @Test
    public void parseCompoundLexeme() {
        String lexeme = "lexeme-lexeme1, ";
        TextComposite lexemeComposite = new TextComposite(ComponentType.LEXEME);
        wordParser.parse(lexemeComposite, lexeme);
        int expected = 2;
        int actual = lexemeComposite.getComponents().size();
        Assert.assertEquals(expected, actual);
    }

    @Test
    public void parseOneWordLexeme() {
        String lexeme = "lexeme ";
        TextComposite lexemeComposite = new TextComposite(ComponentType.LEXEME);
        wordParser.parse(lexemeComposite, lexeme);
        int expected = 1;
        int actual = lexemeComposite.getComponents().size();
        Assert.assertEquals(expected, actual);
    }
}