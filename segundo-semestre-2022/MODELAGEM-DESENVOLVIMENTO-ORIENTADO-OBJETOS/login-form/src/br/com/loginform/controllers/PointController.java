package br.com.loginform.controllers;

import br.com.loginform.dao.DBConnection;
import br.com.loginform.model.Point;
import java.sql.Connection;
import java.sql.SQLException;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.ArrayList;
import java.util.List;
import javax.swing.JOptionPane;

public class PointController {

    private final Connection conn;
    private PreparedStatement stmt;
    private ResultSet rs;

    public PointController() {
        conn = DBConnection.getConn();
    }

    public String createPoint(Point point) {

        try {
            String sql = "INSERT INTO tb_points(name, email, image, whatsapp) values(?, ?, ?, ?)";

            stmt = conn.prepareStatement(sql);
            stmt.setString(1, point.getName());
            stmt.setString(2, point.getEmail());
            stmt.setBytes(3, point.getImage());
            stmt.setString(4, point.getWhatsapp());

            return String.valueOf(stmt.executeUpdate());

        } catch (SQLException ex) {
//            JOptionPane.showMessageDialog(null, ex.getMessage());
            return ex.getMessage();
        } finally {
            DBConnection.closeConn();
        }

    }

    public List<Point> ReadPoint() {

        String sql = "SELECT * FROM tb_points";
        List<Point> pt = new ArrayList<>();

        try {

            stmt = conn.prepareStatement(sql);
            rs = stmt.executeQuery();

            while (rs.next()) {
                Point point = new Point();

                point.setId(rs.getInt("id"));
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

    public void updatePoint(Point point) {

        String sql = "UPDATE tb_points name = ?, email = ?, image = ?, whatsapp = ? WHERE id = ?)";

        try {

            stmt = conn.prepareStatement(sql);

            stmt.setString(1, point.getName());
            stmt.setString(2, point.getEmail());
            stmt.setBytes(3, point.getImage());
            stmt.setString(4, point.getWhatsapp());

            stmt.setInt(5, point.getId());

            stmt.executeQuery();

        } catch (SQLException ex) {
            System.out.println(ex.getMessage());
        }

    }

    public void deletePoint(Point point) {

        String sql = "DELETE FROM tb_points WHERE id = ?";

        try {

            stmt = conn.prepareStatement(sql);
            stmt.setInt(1, point.getId());

            stmt.executeUpdate();

        } catch (SQLException ex) {
            System.out.println(ex.getMessage());
        }

    }

}
