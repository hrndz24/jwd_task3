package sorter;

import composite.ComponentType;
import composite.TextComponent;
import composite.TextComposite;
import exception.SorterException;

import java.util.Comparator;
import java.util.List;

public class SentenceByWordsCountSorter {

    public TextComposite sort(TextComposite paragraph) throws SorterException {

        if (paragraph == null) {
            throw new SorterException("Null paragraph");
        }
        if (paragraph.getComponentType() != ComponentType.PARAGRAPH) {
            throw new SorterException("Cannot sort sentences in this composite");
        }

        List<TextComponent> components = paragraph.getComponents();
        components.sort(new Comparator<TextComponent>() {
            @Override
            public int compare(TextComponent o1, TextComponent o2) {
                return Integer.compare(o1.getComponents().size(), o2.getComponents().size());
            }
        });
        return paragraph;
    }
}
