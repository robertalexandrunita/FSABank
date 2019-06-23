package com.github.robertnita.bankapplication.database;

import com.mysql.jdbc.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

/**
 * @author Robert Nita
 */
public class ConnectionManager {

    private static ConnectionManager connectionManager;
    private final String driverName = "com.mysql.jdbc.Driver";
    private final String connectionUrl = "jdbc:mysql://localhost:3306/bank_application";
    private final String username = "root";
    private final String password = "password";

    private Connection connection;

    private ConnectionManager()
    {
        this.connection = null;
        try {
            Class.forName(driverName);
        } catch (ClassNotFoundException e) {
            System.out.println("Class path error: " + e);
        }
    }

    public Connection createConnection()
    {
        try {
            this.connection = (Connection) DriverManager.getConnection(connectionUrl, username, password);

        } catch (SQLException ex) {
            System.out.println("SQL error: " + ex);
        }
        return this.connection;
    }

    public void closeConnection()
    {
        try {
            this.connection.close();
        } catch (SQLException ex) {
            System.out.println("SQL error: " + ex);
        }
    }

    public static ConnectionManager getInstance()
    {
        if (connectionManager == null) {
            connectionManager = new ConnectionManager();
        }
        return connectionManager;
    }
}
