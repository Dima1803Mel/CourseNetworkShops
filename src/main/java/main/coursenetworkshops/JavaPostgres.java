package main.coursenetworkshops;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class JavaPostgres {
    private static final String URL = "jdbc:postgresql://localhost:5432/postgres";
    private static final String USER = "postgres";
    private static final String PASSWORD = "totalWar1234";

    public static Connection connection() {
        Connection conn = null;
        try {
            conn = DriverManager.getConnection(URL, USER, PASSWORD);
            System.out.println("Connected to database");
        } catch (SQLException e) {
            System.out.println("Error connecting to database");
            e.printStackTrace();
        }
        return conn;
    }
}
