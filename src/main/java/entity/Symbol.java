package entity;

import java.util.ArrayList;
import java.util.List;

public class Symbol implements TextComponent {

    private char symbol;

    public Symbol(char symbol) {
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
}
