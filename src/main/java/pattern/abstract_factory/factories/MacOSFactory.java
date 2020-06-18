package pattern.abstract_factory.factories;

import pattern.abstract_factory.buttons.Button;
import pattern.abstract_factory.buttons.MacOSButton;
import pattern.abstract_factory.checkboxes.Checkbox;
import pattern.abstract_factory.checkboxes.MacOSCheckbox;


public class MacOSFactory implements GUIFactory  {
    @Override
    public Button createButton() {
        return new MacOSButton();
    }

    @Override
    public Checkbox createCheckbox() {
        return new MacOSCheckbox();
    }
}
