package br.com.loginform.controllers;

import br.com.loginform.dao.DBConnection;
import br.com.loginform.model.ItemsModel;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

public class ItemsController {

    private ResultSet rs;
    private Connection conn = null;
    private PreparedStatement stmt;

    public List<ItemsModel> ReadItems() {

        List<ItemsModel> pt = new ArrayList<>();
        String sql = "SELECT * FROM tb_items";

        try {

            conn = DBConnection.getConn();

            stmt = conn.prepareStatement(sql);
            rs = stmt.executeQuery();

            while (rs.next()) {
                ItemsModel item = new ItemsModel();

                item.setId(String.valueOf(rs.getInt("id")));
                item.setTitle(rs.getString("title"));
                item.setSlug(rs.getString("slug"));

                pt.add(item);
            }
        } catch (ClassNotFoundException | SQLException ex) {
            System.out.println(ex.getMessage());
        }

        return pt;
    }

}
