package DAO;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class ConnectionManager {

    public static Connection getConnection() throws SQLException {
        return DriverManager.getConnection("jdbc:sqlserver://datatechserver.database.windows.net;databaseName=datatech;user=datatech;password=Datttechoffice01");
    }
    
}
