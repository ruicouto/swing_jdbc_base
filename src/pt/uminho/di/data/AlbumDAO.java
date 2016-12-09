/*
 * AlbumDAO
 * ruicouto in 30/nov/2016
 */
package pt.uminho.di.data;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;
import pt.uminho.di.business.Album;
import pt.uminho.di.data.database.Connect;

/**
 * Class to handle albuns persistence
 * @author ruicouto
 */
public class AlbumDAO {
    
    /**
     * Add an album to the database
     * @param album
     * @throws SQLException 
     */
    public static void save(Album album) throws SQLException {
        Connection c = Connect.connect();
        
        //Note the usage of a prepared statement to avoid security issues
        PreparedStatement ps = c
                .prepareStatement("insert into albums values"
                        + "( ?, ? )");
        ps.setString(1, album.getName());
        ps.setString(2, album.getArtist());
        
        ps.executeUpdate();    
        c.close();
    } 
    
    /**
     * Lista al albuns from the database
     * @return
     * @throws SQLException 
     */
    public static List<Album> list() throws SQLException {
        Connection c = Connect.connect();
        ResultSet rs = c.createStatement()
                .executeQuery("Select * from albums");
        List<Album> list = new ArrayList<>();
        
        while(rs.next()) { //iterate all albuns
            String name = rs.getString("name");
            String artist = rs.getString("artist");
            Album a = new Album(name, artist);
            list.add(a);
        }
        return list;       
    }
    
}
