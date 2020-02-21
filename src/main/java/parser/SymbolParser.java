package parser;

import entity.TextLeafComponent;
import entity.TextComponent;
import entity.TextComposite;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class SymbolParser implements TextParser {

    public static final String SYMBOL_REGEX = "";

    @Override
    public TextComponent parse(TextComposite composite, String textToParse) {
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
