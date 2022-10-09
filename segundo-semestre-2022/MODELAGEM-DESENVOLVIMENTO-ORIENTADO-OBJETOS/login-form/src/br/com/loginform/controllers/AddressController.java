package br.com.loginform.controllers;

import br.com.loginform.dao.DBConnection;
import br.com.loginform.model.Address;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;

public class AddressController {

    private final Connection conn;
    private PreparedStatement stmt;

    public AddressController() {
        this.conn = DBConnection.getConn();
    }

    public String createAddress(Address address) {

        if (conn != null) {

            try {

                String sql = "INSERT INTO tb_address(zipcode, number, uf, city, point_id) values(?, ?, ?, ?, ?)";

                stmt = conn.prepareStatement(sql);

                stmt.setString(1, address.getZipcode());
                stmt.setString(2, String.valueOf(address.getNumber()));
                stmt.setString(3, address.getUf());
                stmt.setString(4, address.getCity());
                stmt.setString(5, String.valueOf(address.getPointId()));

                conn.commit();

                return String.valueOf(stmt.executeUpdate());

            } catch (SQLException ex) {
                try {
                    conn.rollback();
                    return "=> Erro de SQL na class createAddress.\n=>Error: " + ex.getMessage();
                } catch (SQLException ex1) {
                    return "=>Error: " + ex.getMessage();
                }
            } finally {
                DBConnection.closeConn();
            }

        } else {
            return "=> Erro na tentativa de cadastrar o ponto, verifique a conexão com o BD.";
        }
    }

}
