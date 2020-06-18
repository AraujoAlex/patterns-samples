package br.com.devmedia.patherns.abstract_factory.factories;

import br.com.devmedia.patherns.abstract_factory.buttons.Button;
import br.com.devmedia.patherns.abstract_factory.buttons.WindowsButton;
import br.com.devmedia.patherns.abstract_factory.checkboxes.Checkbox;
import br.com.devmedia.patherns.abstract_factory.checkboxes.WindowsCheckbox;

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
