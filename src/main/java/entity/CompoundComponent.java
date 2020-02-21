package entity;

import java.util.ArrayList;
import java.util.List;

public class CompoundComponent implements TextComponent{

    private ComponentType type;
    private List<TextComponent> components;

    public CompoundComponent(ComponentType type) {
        this.type = type;
        this.components = new ArrayList<TextComponent>();
    }

    public List<TextComponent> getComponents() {
        return null;
    }

    public ComponentType getComponentType() {
        return type;
    }

    public void addComponent(TextComponent component) {
        components.add(component);
    }
}
