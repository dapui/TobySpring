package toby.spring.dao;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class SimpleConnectionMaker {
    public Connection makeNewConnection() throws ClassNotFoundException, SQLException {
        final String URL = "jdbc:mariadb://localhost:3306/tobyspring";
        final String USER = "root";
        final String PASSWORD = "root";
        Class.forName("org.mariadb.jdbc.Driver");
        Connection conn = DriverManager.getConnection(URL, USER, PASSWORD);

        return conn;
    }
}
