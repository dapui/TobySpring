package toby.spring.dao;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class DConnectionMaker implements ConnectionMaker {

    public Connection makeConnection() throws ClassNotFoundException, SQLException {
        // D사의 독자적인 방법으로 Connection을 생성하는 코드
        final String URL = "jdbc:mariadb://localhost:3306/tobyspring";
        final String USER = "root";
        final String PASSWORD = "root";
        Class.forName("org.mariadb.jdbc.Driver");
        Connection conn = DriverManager.getConnection(URL, USER, PASSWORD);

        return conn;
    }
}
