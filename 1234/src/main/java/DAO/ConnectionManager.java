package DAO;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class ConnectionManager {

    public static Connection getConnection() throws SQLException {
        return DriverManager.getConnection("jdbc:sqlserver://localhost:1433;databaseName=master;user=Teste;password=1234;encrypt=true;trustServerCertificate=true");
    }
    
}
