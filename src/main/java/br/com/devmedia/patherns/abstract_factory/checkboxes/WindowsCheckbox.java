package br.com.devmedia.patherns.abstract_factory.checkboxes;

public class WindowsCheckbox implements Checkbox {

    @Override
    public void paint() {
        System.out.println("You have created WindowsCheckbox");
    }
}
