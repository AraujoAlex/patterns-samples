package br.com.devmedia.patherns.abstract_factory.factories;

import br.com.devmedia.patherns.abstract_factory.buttons.Button;
import br.com.devmedia.patherns.abstract_factory.checkboxes.Checkbox;

//FÁBRICA ABSTRATA
public interface GUIFactory {
    Button createButton();
    Checkbox createCheckbox();
}
