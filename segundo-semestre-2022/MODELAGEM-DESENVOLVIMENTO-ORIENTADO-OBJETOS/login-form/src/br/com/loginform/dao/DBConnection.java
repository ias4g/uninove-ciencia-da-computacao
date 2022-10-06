package br.com.loginform.dao;

import java.sql.Connection;
import java.sql.PreparedStatement;

public class DBConnection {

    private Connection conn;
    private PreparedStatement stmt;

    private final String BD_USER = "student";
    private final String BD_PASSWORD = "Izael@student";
    private final String BD_URL = "jdbc:mysql://localhost:3306/db_ecoleta";

    public void connect() {

    }
}
