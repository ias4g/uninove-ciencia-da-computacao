package dao;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;
import model.Product;

public class UserDAO {

    private static Connection getConnection() {

        Connection conn = null;

        try {
            String driver = "jdbc:sqlite:E:\\Meu Drive\\Classroom\\5º SEMESTRE - TURMA 24\\APLICACOES ORIENTADAS A OBJETOS TURMA 24 - MM\\activities\\products-mvc-activity-03\\src\\sample.db";

            Class.forName("org.sqlite.JDBC");
            conn = DriverManager.getConnection(driver);
        } catch (ClassNotFoundException | SQLException e) {
            System.out.println("Erro database, " + e.getMessage());
        }

        return conn;
    }

    public static List<Product> getAllProducts() {
        List<Product> products = new ArrayList<>();

        try {
            String sql = "SELECT * FROM products";

            Connection conn = getConnection();
            PreparedStatement pst = conn.prepareStatement(sql);

            ResultSet rs = pst.executeQuery();

            while (rs.next()) {

                Product p = new Product();

                p.setId(rs.getInt("id"));
                p.setName(rs.getString("name"));
                p.setDescription(rs.getString("description"));
                p.setCategory(rs.getString("category"));
                p.setPrice(rs.getDouble("price"));
                p.setStock(Integer.parseInt(rs.getString("stock")));
                p.setSku(rs.getString("sku"));
                p.setSupplier(rs.getString("supplier"));
                p.setImageURL(rs.getString("imageURL"));
                p.setRegistrationDate(LocalDate.parse(rs.getString("RegistrationDate")));
                p.setExpirationDate(LocalDate.parse(rs.getString("ExpirationDate")));

                products.add(p);

            }
        } catch (SQLException e) {
            System.out.println("error metodo getAllProducts, " + e.getMessage());
        }

        return products;
    }

    public static int createProducts(Product p) {

        int status = 0;

        try {
            String sql = "INSERT INTO products (name, description, category, price, stock, sku, supplier, imageURL, registrationDate, expirationDate) VALUES (?, ?, ?, ?, ?, ?, ?, ?, ?, ?)";

            Connection conn = getConnection();
            PreparedStatement pst = conn.prepareStatement(sql);

            pst.setString(1, p.getName());
            pst.setString(2, p.getDescription());
            pst.setString(3, p.getCategory());
            pst.setDouble(4, p.getPrice());
            pst.setInt(5, p.getStock());
            pst.setString(6, p.getSku());
            pst.setString(7, p.getSupplier());
            pst.setString(8, p.getImageURL());
            pst.setString(9, String.valueOf(p.getRegistrationDate()));
            pst.setString(10, String.valueOf(p.getExpirationDate()));

            status = pst.executeUpdate();

        } catch (SQLException e) {
            System.out.println("error metodo createProducts, " + e.getMessage());
        }

        return status;

    }

    public static Product getProductId(int id) {

        Product p = null;

        try {
            String sql = "SELECT * FROM products WHERE id = ?";

            Connection conn = getConnection();
            PreparedStatement pst = conn.prepareStatement(sql);

            pst.setInt(1, id);

            ResultSet rs = pst.executeQuery();

            while (rs.next()) {

                p = new Product();

                p.setId(rs.getInt("id"));
                p.setName(rs.getString("name"));
                p.setDescription(rs.getString("description"));
                p.setCategory(rs.getString("category"));
                p.setPrice(rs.getDouble("price"));
                p.setStock(Integer.parseInt(rs.getString("stock")));
                p.setSku(rs.getString("sku"));
                p.setSupplier(rs.getString("supplier"));
                p.setImageURL(rs.getString("imageURL"));
                p.setRegistrationDate(LocalDate.parse(rs.getString("RegistrationDate")));
                p.setExpirationDate(LocalDate.parse(rs.getString("ExpirationDate")));

            }
        } catch (SQLException e) {
            System.out.println("error metodo getAllProducts, " + e.getMessage());
        }

        return p;
    }
}
