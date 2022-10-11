package br.com.loginform.controllers;

import br.com.loginform.dao.DBConnection;
import br.com.loginform.model.ItemsModel;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;

public class ItemsController {

    private ResultSet rs;
    private final Connection conn;
    private PreparedStatement stmt;

    public ItemsController() {
        this.conn = DBConnection.getConn();
    }

    public ArrayList<ItemsModel> ReadItems() {

        ArrayList<ItemsModel> pt = new ArrayList<>();
        String sql = "SELECT * FROM tb_items";

        try {
            stmt = conn.prepareStatement(sql);
            rs = stmt.executeQuery();

            while (rs.next()) {
                ItemsModel item = new ItemsModel();

                item.setId(rs.getInt("id"));
                item.setTitle(rs.getString("title"));
                item.setSlug(rs.getString("slug"));

                pt.add(item);
            }
        } catch (SQLException ex) {
            System.out.println(ex.getMessage());
        }

        return pt;
    }

}
