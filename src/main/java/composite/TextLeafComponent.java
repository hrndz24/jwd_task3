package composite;

import java.util.ArrayList;
import java.util.List;

public class TextLeafComponent implements TextComponent {

    private String symbol;

    public TextLeafComponent(String symbol) {
        this.symbol = symbol;
    }

    public List<TextComponent> getComponents() {
        List<TextComponent> symbols = new ArrayList<TextComponent>();
        symbols.add(this);
        return symbols;
    }

    public ComponentType getComponentType() {
        return ComponentType.SYMBOL;
    }

    public void addComponent(TextComponent component) {
        throw new UnsupportedOperationException();
    }

    @Override
    public String toString() {
        return symbol;
    }
}
