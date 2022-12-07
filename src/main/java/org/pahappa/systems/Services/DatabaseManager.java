package org.pahappa.systems.Services;

import java.sql.*;

import static java.sql.DriverManager.getConnection;

public class DatabaseManager {
    Connection connection;
    public Statement db_connection() {
        String dbUrl = "jdbc:mysql://localhost:3306/database2";
        String username = "root";
        String password = "password@234";
        Statement statement;
        try {
            Class.forName("com.mysql.cj.jdbc.Driver");
            connection = getConnection(dbUrl, username, password);
            statement = connection.createStatement();
        } catch (ClassNotFoundException e) {
            throw new RuntimeException(e);
        } catch (SQLException e) {
            throw new RuntimeException(e);
        }
        return statement;
    }
}