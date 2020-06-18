package br.com.devmedia.patherns.abstract_factory.factories;

import br.com.devmedia.patherns.abstract_factory.buttons.Button;
import br.com.devmedia.patherns.abstract_factory.buttons.MacOSButton;
import br.com.devmedia.patherns.abstract_factory.checkboxes.Checkbox;
import br.com.devmedia.patherns.abstract_factory.checkboxes.MacOSCheckbox;


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
