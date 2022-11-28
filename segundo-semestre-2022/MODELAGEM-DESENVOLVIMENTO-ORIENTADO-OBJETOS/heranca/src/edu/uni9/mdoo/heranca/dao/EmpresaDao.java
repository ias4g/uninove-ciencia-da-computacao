package edu.uni9.mdoo.heranca.dao;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;

public class EmpresaDao {

    private Connection conn = null;
    private PreparedStatement stmt = null;

    private final String BD_USER = "student";
    private final String BD_PASSWORD = "Izael@student";
    private final String BD_URL = "jdbc:mysql://localhost:3306/emp_her";
    private final String BD_DRIVER = "com.mysql.cj.jdbc.Driver";

    public void getConn() throws ClassNotFoundException, SQLException {
        Class.forName(BD_DRIVER);
        conn = DriverManager.getConnection(BD_URL, BD_USER, BD_PASSWORD);
    }

}
