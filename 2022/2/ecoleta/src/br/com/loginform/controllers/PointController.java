package br.com.loginform.controllers;

import br.com.loginform.dao.DBConnection;
import br.com.loginform.model.PointModel;
import java.sql.Connection;
import java.sql.SQLException;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.ArrayList;
import java.util.List;

public class PointController {

    private Connection conn = null;
    private PreparedStatement stmt;
    private ResultSet rs;

    public String createPoint(PointModel point) {

        if (conn != null) {

            try {

                conn = DBConnection.getConn();

                String sql = "INSERT INTO tb_points(id, name, email, image, whatsapp) values(?, ?, ?, ?, ?)";

                stmt = conn.prepareStatement(sql);

                stmt.setString(1, point.getId());
                stmt.setString(2, point.getName());
                stmt.setString(3, point.getEmail());
                stmt.setBytes(4, point.getImage());
                stmt.setString(5, point.getWhatsapp());

                return String.valueOf(stmt.executeUpdate());

            } catch (ClassNotFoundException | SQLException ex) {
                return "=> Erro de SQL na class createPoint.\n=>Error: " + ex.getMessage();
            }
        } else {
            return "=> Erro na tentativa de cadastrar o ponto, verifique a conexão com o BD.";
        }
    }

    public List<PointModel> ReadPoint() {
        String sql = "SELECT * FROM tb_points";
        List<PointModel> pt = new ArrayList<>();

        try {
            stmt = conn.prepareStatement(sql);
            rs = stmt.executeQuery();

            while (rs.next()) {
                PointModel point = new PointModel();

                point.setId(rs.getString("id"));
                point.setName(rs.getString("name"));
                point.setEmail(rs.getString("email"));
                point.setImage(rs.getBytes("image"));
                point.setWhatsapp(rs.getString("whatsapp"));

                pt.add(point);
            }
        } catch (SQLException ex) {
            System.out.println(ex.getMessage());
        }

        return pt;
    }

    public void updatePoint(PointModel point) {

        String sql = "UPDATE tb_points name = ?, email = ?, image = ?, whatsapp = ? WHERE id = ?)";

        try {

            stmt = conn.prepareStatement(sql);

            stmt.setString(1, point.getName());
            stmt.setString(2, point.getEmail());
            stmt.setBytes(3, point.getImage());
            stmt.setString(4, point.getWhatsapp());

            stmt.setString(5, point.getId());

            stmt.executeUpdate();

        } catch (SQLException ex) {
            System.out.println(ex.getMessage());
        }

    }

    public void deletePoint(PointModel point) {

        String sql = "DELETE FROM tb_points WHERE id = ?";

        try {

            stmt = conn.prepareStatement(sql);
            stmt.setString(1, point.getId());

            stmt.executeUpdate();

        } catch (SQLException ex) {
            System.out.println(ex.getMessage());
        }

    }

}
