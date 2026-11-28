package util;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class DBConnection {
    
    private static final String URL = "jdbc:derby://localhost:1527/BiblioSpaceDB";
    private static final String USER = "BSDB";
    private static final String PASSWORD = "BSDB";
    
    public static Connection getConnection() throws SQLException {
        try {
            Class.forName("org.apache.derby.jdbc.ClientDriver");
        } catch (ClassNotFoundException e) {
            throw new SQLException("Derby Client JDBC Driver not found.", e);            
        }
        return DriverManager.getConnection(URL, USER, PASSWORD);
    }
}
