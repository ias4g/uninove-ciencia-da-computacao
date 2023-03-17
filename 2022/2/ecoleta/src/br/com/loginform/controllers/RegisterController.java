package br.com.loginform.controllers;

import br.com.loginform.dao.DBConnection;
import br.com.loginform.model.AddressModel;
import br.com.loginform.model.PointModel;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.util.List;
import java.util.UUID;

public class RegisterController {

    private Connection conn = null;
    private PreparedStatement stmt;
    private PreparedStatement stmt_address;
    private PreparedStatement stmt_point_items;

    public String createRegister(PointModel pm, AddressModel am, List<String> items) {

        final UUID uuid = UUID.randomUUID();

        try {

            conn = DBConnection.getConn();

            if (conn == null) {
                return "=> Erro na tentativa de cadastrar o ponto, verifique a conexão com o BD.";
            }

            conn.setAutoCommit(false);

            // INSERINDO DADOS NA TABELA TB_POINTS -------------------------------------------------------------------------------
            String pmSQL = "INSERT INTO tb_points(id, name, email, image, whatsapp) values(?, ?, ?, ?, ?)";
            stmt = conn.prepareStatement(pmSQL);

            stmt.setString(1, String.valueOf(uuid));
            stmt.setString(2, pm.getName());
            stmt.setString(3, pm.getEmail());
            stmt.setBytes(4, pm.getImage());
            stmt.setString(5, pm.getWhatsapp());

            stmt.executeUpdate();
            stmt.close();
            // END TB_POINTS -----------------------------------------------------------------------------------------------------

            // INSERINDO DADOS NA TABELA TB_ADDRESS ------------------------------------------------------------------------------
            String amSQL = "INSERT INTO tb_address(zipcode, address, number, uf, city, point_id) values(?, ?, ?, ?, ?, ?)";
            stmt_address = conn.prepareStatement(amSQL);

            stmt_address.setString(1, am.getZipcode());
            stmt_address.setString(2, am.getAddress());
            stmt_address.setInt(3, am.getNumber());
            stmt_address.setString(4, am.getUf());
            stmt_address.setString(5, am.getCity());
            stmt_address.setString(6, String.valueOf(uuid));

            stmt_address.executeUpdate();
            // END TB_ADDRESS ---------------------------------------------------------------------------------------------------

            // INSERINDO DADOS NA TABELA TB_POINT_ITEMS -------------------------------------------------------------------------
            String pimSQL = "INSERT INTO tb_point_items(point_id, item_id) values(?, ?)";
            stmt_point_items = conn.prepareStatement(pimSQL);
            for (String it : items) {

                if (it != null) {
                    stmt_point_items.setString(1, String.valueOf(uuid));
                    stmt_point_items.setInt(2, Integer.parseInt(it));

                    stmt_point_items.executeUpdate();
                }
            }
            // END TB_POINT_ITEMS

            conn.commit();

            return "ok";

        } catch (ClassNotFoundException | SQLException ex) {
            try {
                conn.rollback();
            } catch (SQLException ex1) {
                return "=> Erro no rollback na class createPoint.\n=>Error: " + ex.getMessage();
            }

            return "=> Erro de SQL na class RegisterController, no metodo createPoint(). Error: " + ex.getMessage();
        }
    }
}
