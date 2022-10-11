package br.com.loginform.controllers;

import br.com.loginform.dao.DBConnection;
import br.com.loginform.model.AddressModel;
import br.com.loginform.model.PointItemsModel;
import br.com.loginform.model.PointModel;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.UUID;

public class RegisterController {

    private final Connection conn;
    private PreparedStatement stmt;
    private ResultSet rs;

    public RegisterController() {
        this.conn = DBConnection.getConn();
    }

    public String createRegister(PointModel pm, AddressModel am, PointItemsModel pim) {

        final UUID uuid = UUID.randomUUID();

        if (conn != null) {

            try {

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
                String amSQL = "INSERT INTO tb_address(zipcode, number, uf, city, point_id) values(?, ?, ?, ?, ?)";
                stmt.setString(1, am.getAddress());
                stmt.setInt(2, am.getNumber());
                stmt.setString(3, am.getUf());
                stmt.setString(4, am.getCity());
                stmt.setString(5, String.valueOf(uuid));
                // END TB_ADDRESS ---------------------------------------------------------------------------------------------------

                // INSERINDO DADOS NA TABELA TB_POINT_ITEMS -------------------------------------------------------------------------
                String pimSQL = "INSERT INTO tb_point_items(point_id, item_id) values(?, ?)";
                // END TB_POINT_ITEMS

                return "Dados cadastrados com sucesso";
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
