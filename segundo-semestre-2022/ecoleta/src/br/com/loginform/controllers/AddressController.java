package br.com.loginform.controllers;

import br.com.loginform.dao.DBConnection;
import br.com.loginform.model.AddressModel;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;

public class AddressController {

    private Connection conn = null;
    private PreparedStatement stmt;

    public String createAddress(AddressModel address) {

        if (conn != null) {

            try {

                conn = DBConnection.getConn();

                String sql = "INSERT INTO tb_address(zipcode, number, uf, city, point_id) values(?, ?, ?, ?, ?)";

                stmt = conn.prepareStatement(sql);

                stmt.setString(1, address.getZipcode());
                stmt.setString(2, String.valueOf(address.getNumber()));
                stmt.setString(3, address.getUf());
                stmt.setString(4, address.getCity());
                stmt.setString(5, String.valueOf(address.getPointId()));

                return String.valueOf(stmt.executeUpdate());

            } catch (ClassNotFoundException | SQLException ex) {
                return "=> Erro de SQL na class createAddress.\n=>Error: " + ex.getMessage();
            }
        } else {
            return "=> Erro na tentativa de cadastrar o ponto, verifique a conexão com o BD.";
        }
    }

}
