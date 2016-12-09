/*
 * Connect
 * ruicouto in 28/nov/2016
 */
package pt.uminho.di.data.database;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

/**
 * This class
 * @author ruicouto
 */
public class Connect {
    
    private static final String USERNAME = "your_mysql_username";
    private static final String PASSWORD = "your_mysql_password";
    private static final String URL = "localhost";
    private static final String SCHEMA = "albums";
    

    static {
        try {
            Class.forName("com.mysql.jdbc.Driver");   
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
    
    public static Connection connect() throws SQLException {
        return DriverManager.getConnection("jdbc:mysql://"+URL+"/"+SCHEMA+"?user="+USERNAME+"&password="+PASSWORD);
    }
    
}
