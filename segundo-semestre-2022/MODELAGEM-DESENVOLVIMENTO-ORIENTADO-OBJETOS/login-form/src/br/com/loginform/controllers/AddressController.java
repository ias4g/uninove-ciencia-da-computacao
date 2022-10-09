package br.com.loginform.controllers;

import br.com.loginform.dao.DBConnection;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;

public class AddressController {

    private final Connection conn;
    private PreparedStatement stmt;
    private ResultSet rs;

    public AddressController(Connection conn) {
        this.conn = DBConnection.getConn();
    }

}
