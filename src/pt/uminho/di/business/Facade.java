/*
 * Facade
 * ruicouto in 30/nov/2016
 */
package pt.uminho.di.business;

import java.util.List;
import pt.uminho.di.data.AlbumDAO;

/**
 * Facade for the business class
 * @author ruicouto
 */
public class Facade {
    
    /**
     * Get a list of all albuns
     * This method can be improved: The list of albuns could be cached, and 
     * updated only from the DAO when a new album is added/removed
     * @return 
     */
    public List<Album> listAlbums() {
        try {
            return AlbumDAO.list();
        } catch (Exception e) {
            e.printStackTrace();
        }
        return null;
    }
    
    /**
     * Add a new album
     * @param a 
     */
    public void add(Album a) {
        try {
            AlbumDAO.save(a);
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}


