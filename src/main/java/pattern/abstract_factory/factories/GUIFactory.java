package pattern.abstract_factory.factories;

import pattern.abstract_factory.buttons.Button;
import pattern.abstract_factory.checkboxes.Checkbox;

//FÁBRICA ABSTRATA
public interface GUIFactory {
    Button createButton();
    Checkbox createCheckbox();
}
