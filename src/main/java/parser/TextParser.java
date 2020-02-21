package parser;

import entity.TextComponent;
import entity.TextComposite;

public interface TextParser {

    TextComponent parse(TextComposite composite, String textToParse);
}
