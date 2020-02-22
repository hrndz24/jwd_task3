package parser;

import composite.TextComposite;

public interface TextParser {

    TextComposite parse(TextComposite composite, String textToParse);
}
