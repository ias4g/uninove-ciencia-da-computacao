package br.com.loginform.controllers;

import br.com.loginform.dao.DBConnection;
import br.com.loginform.model.Address;
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
        conn = DBConnection.getConn();
    }

    public ArrayList createPoint(Point point) {

        ArrayList<Object> a = new ArrayList();
        int result = 0;

        if (conn != null) {

            try {
                String sql = "INSERT INTO tb_points(name, email, image, whatsapp) values(?, ?, ?, ?)";

                stmt = conn.prepareStatement(sql);
                stmt.setString(1, point.getName());
                stmt.setString(2, point.getEmail());
                stmt.setBytes(3, point.getImage());
                stmt.setString(4, point.getWhatsapp());

//                return stmt.executeUpdate();
                if (stmt.executeUpdate() == 1) {

                    String getLastedId = "SELECT MAX(id) as id FROM tb_points";

                    stmt = conn.prepareStatement(getLastedId);
                    rs = stmt.executeQuery();

                    while (rs.next()) {
//                        result = Integer.parseInt(rs.getString("id"));
                        a.add(rs.getInt("id"));
                    }
                }

                return a;

            } catch (SQLException ex) {
//                return ex.getMessage();

                a.add(ex.getMessage());

                return a;
            } finally {
                DBConnection.closeConn();
            }
        } else {
            a.add("Erro na tentativa de cadastrar o ponto, verifique a conexão com o BD.");
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

    public String getLastedId() {

        String result = "";

        if (conn != null) {

            try {
                String getLastedId = "SELECT MAX(id) as id FROM tb_points";

                stmt = conn.prepareStatement(getLastedId);
                rs = stmt.executeQuery();

                while (rs.next()) {
                    result = rs.getString("id");
                }

                return result;

            } catch (SQLException ex) {
                return ex.getMessage();
            } finally {
                DBConnection.closeConn();
            }
        } else {
            return "Erro na tentativa de cadastrar o ponto, verifique a conexão com o BD.";
        }
    }

}
