package parser;

import entity.TextComposite;
import entity.TextLeafComponent;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class SymbolParser implements TextParser {

    public static final String SYMBOL_REGEX = ".";

    @Override
    public TextComposite parse(TextComposite composite, String textToParse) {
        Pattern symbolPattern = Pattern.compile(SYMBOL_REGEX);
        Matcher symbolMatcher = symbolPattern.matcher(textToParse);

        String symbol;
        while (symbolMatcher.find()){
            symbol = symbolMatcher.group();
            composite.addComponent(new TextLeafComponent(symbol));
        }
        return composite;
    }
}
