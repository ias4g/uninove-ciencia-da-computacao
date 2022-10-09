package br.com.loginform.controllers;

import br.com.loginform.dao.DBConnection;
import br.com.loginform.model.Point;
import java.sql.Connection;
import java.sql.SQLException;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.ArrayList;
import java.util.List;

public class PointController {

    private final Connection conn;
    private PreparedStatement stmt;
    private ResultSet rs;

    public PointController() {
        this.conn = DBConnection.getConn();
    }

    public ArrayList createPoint(Point point) {

        ArrayList<Object> a = new ArrayList();

        if (conn != null) {

            try {
                String sql = "INSERT INTO tb_points(name, email, image, whatsapp) values(?, ?, ?, ?)";

                conn.setAutoCommit(false);

                stmt = conn.prepareStatement(sql);
                stmt.setString(1, point.getName());
                stmt.setString(2, point.getEmail());
                stmt.setBytes(3, point.getImage());
                stmt.setString(4, point.getWhatsapp());

                if (stmt.executeUpdate() == 1) {

                    String getLastedId = "SELECT MAX(id) as id FROM tb_points";

                    stmt = conn.prepareStatement(getLastedId);
                    rs = stmt.executeQuery();

                    while (rs.next()) {
                        a.add(rs.getInt("id"));
                    }
                }

//                conn.commit();
                return a;

            } catch (SQLException ex) {
                try {
                    conn.rollback();
                    a.add("=> Erro de SQL na class createPoint.\n=>Error: " + ex.getMessage());
                    return a;
                } catch (SQLException ex1) {
                    a.add(ex1.getMessage());
                    return a;
                }
            } finally {
                DBConnection.closeConn();
            }
        } else {
            a.add("=> Erro na tentativa de cadastrar o ponto, verifique a conexão com o BD.");
            return a;
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

            stmt.executeUpdate();

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
