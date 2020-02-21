package entity;

import java.util.ArrayList;
import java.util.List;

public class TextComposite implements TextComponent {

    private ComponentType type;
    private List<TextComponent> components;

    public TextComposite(ComponentType type) {
        this.type = type;
        this.components = new ArrayList<TextComponent>();
    }

    public List<TextComponent> getComponents() {
        return components;
    }

    public ComponentType getComponentType() {
        return type;
    }

    public void addComponent(TextComponent component) {
        components.add(component);
    }

    @Override
    public String toString() {
        StringBuilder stringBuilder = new StringBuilder();
        for (TextComponent component : components) {
            stringBuilder.append(component);
        }
        return stringBuilder.toString();
    }
}
