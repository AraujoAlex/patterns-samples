package pattern.abstract_factory.application;

import pattern.abstract_factory.buttons.Button;
import pattern.abstract_factory.checkboxes.Checkbox;
import pattern.abstract_factory.factories.GUIFactory;

public class Application {
    private Button button;
    private Checkbox checkbox;

    public Application(GUIFactory factory) {
        button = factory.createButton();
        checkbox = factory.createCheckbox();
    }

    public void paint(){
        button.paint();
        checkbox.paint();
    }
}
