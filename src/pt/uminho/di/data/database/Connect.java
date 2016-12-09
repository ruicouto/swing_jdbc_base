/*
 * Connect
 * ruicouto in 28/nov/2016
 */
package pt.uminho.di.data.database;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

/**
 * This class handles the connections to the database
 * @author ruicouto
 */
public class Connect {
    
    private static final String USERNAME = "root";
    private static final String PASSWORD = "root";
    private static final String URL = "localhost";
    private static final String SCHEMA = "albums";
    
    /**
     * Only required once
     */
    static {
        try {
            Class.forName("com.mysql.jdbc.Driver");   
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
    
    /**
     * Open a connection to the database. Don't forget to close-it after using it.
     * @return
     * @throws SQLException 
     */
    public static Connection connect() throws SQLException {
        return DriverManager.getConnection("jdbc:mysql://"+URL+"/"+SCHEMA+"?user="+USERNAME+"&password="+PASSWORD);
    }
    
}
