package br.com.loginform.controllers;

import br.com.loginform.dao.DBConnection;
import br.com.loginform.model.Address;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

public class AddressController {
    
    private final Connection conn;
    private PreparedStatement stmt;
    private ResultSet rs;
    
    public AddressController(Connection conn) {
        this.conn = DBConnection.getConn();
    }
    
    public String createAddress(Address address) {
        if (conn != null) {
            
            try {
                String sql = "INSERT INTO tb_address(zipcode, number, uf, city, point_id) values(?, ?, ?, ?, ?)";
                
                conn.setAutoCommit(false);
                
                stmt = conn.prepareStatement(sql);
                stmt.setString(1, address.getZipcode());
                stmt.setString(2, String.valueOf(address.getNumber()));
                stmt.setString(3, address.getUf());
                stmt.setString(4, address.getCity());
                stmt.setString(5, String.valueOf(address.getPointId()));
                
                if (stmt.executeUpdate() == 1) {
                    
                    String getLastedId = "SELECT MAX(id) as id FROM tb_points";
                    
                    stmt = conn.prepareStatement(getLastedId);
                    rs = stmt.executeQuery();
                    
                    while (rs.next()) {
                        a.add(rs.getInt("id"));
                    }
                }
                
                conn.commit();
                
                return a;
                
            } catch (SQLException ex) {
                return "=> Erro de SQL na class createPoint.\n=>Error: " + ex.getMessage();
            } finally {
                DBConnection.closeConn();
            }
            
        } else {
            return "=> Erro na tentativa de cadastrar o ponto, verifique a conexão com o BD.";
        }
    }
    
}
