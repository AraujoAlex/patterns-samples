package br.com.devmedia.patherns.abstract_factory;

import br.com.devmedia.patherns.abstract_factory.application.Application;
import br.com.devmedia.patherns.abstract_factory.factories.GUIFactory;
import br.com.devmedia.patherns.abstract_factory.factories.MacOSFactory;
import br.com.devmedia.patherns.abstract_factory.factories.WindowsFactory;

public class Demo {
    private static Application configureApplication(){
        Application app;
        GUIFactory factory;
        String osName = System.getProperty("os.name").toLowerCase();
        if (osName.contains("mac")) {
            factory = new MacOSFactory();
            app = new Application(factory);
        } else {
            factory = new WindowsFactory();
            app = new Application(factory);
        }
        return app;
    }

    public static void main(String[] args) {
        Application app = configureApplication();
        app.paint();
    }
}
