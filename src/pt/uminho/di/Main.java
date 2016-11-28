/*
 * Main
 * ruicouto in 28/nov/2016
 */
package pt.uminho.di;

import pt.uminho.di.business.Album;
import pt.uminho.di.business.Track;

/**
 *
 * @author ruicouto
 */
public class Main {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Album a = new Album("Hardwired... to Self-Destruct","Metallica");
        Track t1 = new Track("Hardwired", 3.09);
        a.getTracks().add(t1);
        Track t2 = new Track("Atlas, Rise!", 6.29);
        a.getTracks().add(t2);
        
        Album b = new Album("Drones","Muse");
        Track t3 = new Track("Dead inside", 4.23);
        b.getTracks().add(t3);
        Track t4 = new Track("[Drill Sergeant]", 0.21);
        b.getTracks().add(t4);
        
        
    }
    
}
