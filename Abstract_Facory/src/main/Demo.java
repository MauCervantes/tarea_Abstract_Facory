package main;

/**
 * Author: Cervantes Carranco Mauricio
 * Date: 08/26/23
 * Description: Aplicación del patron de diseño Abstract Factory
 * IDE: Netbeans 16 
 * JDK: 19
 * Matter: Despliegue de aplicaciones empresariales
 */

import app.Application;
import factories.GUIFactory;
import factories.MacOSFactory;
import factories.WindowsFactory;

public class Demo {
    private static Application configureApplication(){
        Application app;
        GUIFactory factory;
        String osName = System.getProperty("os.name").toLowerCase();

        if (osName.contains("mac"))
            factory = new MacOSFactory();
        else
            factory = new WindowsFactory();

        app = new Application(factory);
        return app;
    }

    public static void main(String [] args){
        Application app = configureApplication();
        app.paint();;
    }
}
