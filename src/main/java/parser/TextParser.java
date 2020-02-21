package parser;

import entity.TextComponent;
import entity.TextComposite;

public interface TextParser {

    TextComposite parse(TextComposite composite, String textToParse);
}
