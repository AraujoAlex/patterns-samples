package pattern.abstract_factory;

import pattern.abstract_factory.application.Application;
import pattern.abstract_factory.factories.GUIFactory;
import pattern.abstract_factory.factories.MacOSFactory;
import pattern.abstract_factory.factories.WindowsFactory;

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
