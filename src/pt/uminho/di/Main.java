/*
 * Main
 * ruicouto in 28/nov/2016
 */
package pt.uminho.di;

import pt.uminho.di.business.Facade;
import pt.uminho.di.presentation.MainView;

/**
 * The class which starts the application
 * @author ruicouto
 */
public class Main {

    /**
     * Creates the Facade instance, the main view and starts it.
     * @param args the command line arguments
     */
    public static void main(String[] args) {        
        Facade f = new Facade(); //Facade could be a Singleton
        MainView mv = new MainView(f);
        mv.setLocationRelativeTo(null);
        mv.setVisible(true);
    }
    
}
