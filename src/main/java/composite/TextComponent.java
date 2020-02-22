package composite;

import java.util.List;

public interface TextComponent {

    void addComponent(TextComponent component);

    List<TextComponent> getComponents();
}
