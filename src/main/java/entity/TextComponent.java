package entity;

import java.util.List;

public interface TextComponent {

    List<TextComponent> getComponents();

    ComponentType getComponentType();

    void addComponent(TextComponent component);
}
