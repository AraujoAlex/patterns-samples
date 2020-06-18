package pattern.abstract_factory.factories;

import pattern.abstract_factory.buttons.Button;
import pattern.abstract_factory.buttons.WindowsButton;
import pattern.abstract_factory.checkboxes.Checkbox;
import pattern.abstract_factory.checkboxes.WindowsCheckbox;

public class WindowsFactory implements GUIFactory {
    @Override
    public Button createButton() {
        return new WindowsButton();
    }

    @Override
    public Checkbox createCheckbox() {
        return new WindowsCheckbox();
    }
}
