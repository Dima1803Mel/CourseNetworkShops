package main.coursenetworkshops;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;

public class DataBaseConnection {
    private static final String URL = "jdbc:postgresql://localhost:5432/postgres";
    private static final String USER = "postgres";
    private static final String PASSWORD = "totalWar1234";

    public static String sql = "INSERT INTO account(login, password_Account) VALUES(?,?)";

    public static Connection connection() {
        Connection conn = null;
        try {
            conn = DriverManager.getConnection(URL, USER, PASSWORD);
            System.out.println("Connected to database");
        } catch (Exception e) {
            System.out.println("Error connecting to database");
            e.printStackTrace();
        }
        return conn;
    }

    public static void writeToDatabase(String login, String password) {
        login = login.toLowerCase();
        password = password.toLowerCase();

        try(Connection conn = DriverManager.getConnection(URL, USER, PASSWORD);
            Statement stmt = conn.prepareStatement(sql)) {
            stmt.setCursorName(login);
            stmt.setCursorName(password);
            stmt.executeUpdate(sql);
            System.out.println("successfully wrote to the database");
        } catch (Exception e) {
            e.printStackTrace();
            System.out.printf("Ошибка в writeToDatabase");
        }
    }
}
