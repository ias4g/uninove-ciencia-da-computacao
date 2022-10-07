package br.com.loginform.dao;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class DBConnection {

    private static Connection conn;

    private final static String BD_USER = "student";
    private final static String BD_PASSWORD = "Izael@student";
    private final static String BD_URL = "jdbc:mysql://localhost:3306/db_ecoleta";

    public static Connection getConn() {
        try {
            Class.forName("com.mysql.cj.jdbc.Driver");
            conn = DriverManager.getConnection(BD_URL, BD_USER, BD_PASSWORD);

        } catch (ClassNotFoundException | SQLException ex) {
            System.out.println(ex.getMessage());
        }

        return conn;
    }

    public static void closeConn() {
        try {
            conn.close();
        } catch (SQLException ex) {
            System.out.println(ex.getMessage());
        }
    }
}
