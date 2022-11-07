package dados;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.PreparedStatement;
import java.sql.ResultSet;

public class SystemDao {

    private ResultSet resultado;
    private Connection conectado;
    private PreparedStatement st;

    private final String USER = "student";
    private final String PASS = "Izael@student";
    private final String URL = "jdbc:mysql://localhost:3306/bdsystem";

    private void conectar() throws ClassNotFoundException, SQLException {

        Class.forName("com.mysql.cj.jdbc.Driver");

        conectado = DriverManager.getConnection(URL, USER, PASS);

    }

    public ResultSet validarUsuario(String usuario, String senha) throws SQLException, ClassNotFoundException {

        conectar();

        st = conectado.prepareStatement(
                "SELECT * FROM tbusers WHERE user = ? AND password = ?"
        );

        st.setString(1, usuario);
        st.setString(2, senha);

        resultado = st.executeQuery();

        return resultado;

    }

    public void salvarUsuario(User user) throws ClassNotFoundException, SQLException {
        conectar();

        st = conectado.prepareStatement("INSERT INTO tbusers (user, password, name, lastname, email, job) VALUES (?, ?, ?, ?, ?, ?)");

        st.setString(1, user.getUser());
        st.setString(2, user.getPassword());
        st.setString(3, user.getName());
        st.setString(4, user.getLastname());
        st.setString(5, user.getEmail());
        st.setString(6, user.getJob());

        st.executeUpdate();
    }

    public ResultSet listarUsuario(String usuario) throws ClassNotFoundException, SQLException {

        conectar();

        st = conectado.prepareStatement(
                "SELECT * FROM tbusers WHERE user = ?"
        );

        st.setString(1, usuario);

        resultado = st.executeQuery();

        return resultado;
    }

    public ResultSet listarProduct(String id) throws ClassNotFoundException, SQLException {

        conectar();

        st = conectado.prepareStatement(
                "SELECT * FROM tbproducts WHERE id = ?"
        );

        st.setString(1, id);

        resultado = st.executeQuery();

        return resultado;
    }

    public ResultSet listarProductsId() throws ClassNotFoundException, SQLException {

        conectar();

        st = conectado.prepareStatement(
                "SELECT id FROM tbproducts"
        );

        resultado = st.executeQuery();

        return resultado;
    }

    public ResultSet listarUsuarios() throws ClassNotFoundException, SQLException {
        conectar();

        st = conectado.prepareStatement(
                "SELECT * FROM tbusers"
        );

        resultado = st.executeQuery();

        return resultado;
    }

    public ResultSet listarProducts() throws ClassNotFoundException, SQLException {

        conectar();

        st = conectado.prepareStatement(
                "SELECT * FROM tbproducts"
        );

        resultado = st.executeQuery();

        return resultado;
    }

    public ResultSet listarUsuarioPeloCargo(String cargo) throws ClassNotFoundException, SQLException {
        conectar();

        st = conectado.prepareStatement("SELECT * FROM tbusers WHERE job = ?");
        st.setString(1, cargo);

        resultado = st.executeQuery();

        return resultado;
    }

    public ResultSet listProductsForName(String search) throws ClassNotFoundException, SQLException {

        conectar();

        st = conectado.prepareStatement("SELECT * FROM tbproducts WHERE name LIKE ?");
        st.setString(1, "%" + search + "%");

        resultado = st.executeQuery();

        return resultado;
    }

    public void deletarUsuario(String id) throws ClassNotFoundException, SQLException {

        conectar();
        st = conectado.prepareStatement(
                "DELETE FROM tbusers WHERE id = ?"
        );

        st.setString(1, id);

        st.executeUpdate();
    }

    public void deletarProduct(String id) throws ClassNotFoundException, SQLException {

        conectar();

        st = conectado.prepareStatement(
                "DELETE FROM tbproducts WHERE id = ?"
        );

        st.setString(1, id);

        st.executeUpdate();
    }

    public void alterarUsuario(User user) throws ClassNotFoundException, SQLException {
        conectar();

        st = conectado.prepareStatement("UPDATE tbusers SET user = ?, password = ?, name = ?, lastname = ?, email = ?, job = ? WHERE id = ?");

        st.setString(1, user.getUser());
        st.setString(2, user.getPassword());
        st.setString(3, user.getName());
        st.setString(4, user.getLastname());
        st.setString(5, user.getEmail());
        st.setString(6, user.getJob());
        st.setInt(7, user.getId());

        st.executeUpdate();
    }

    public void alterarProduct(Product product) throws ClassNotFoundException, SQLException {

        conectar();

        st = conectado.prepareStatement("UPDATE tbproducts SET name = ?, brand = ?, price = ? WHERE id = ?");

        st.setString(1, product.getName());
        st.setString(2, product.getBrand());
        st.setDouble(3, product.getPrice());
        st.setString(4, product.getId());

        st.executeUpdate();
    }

    public void salvarProduct(Product product) throws ClassNotFoundException, SQLException {
        conectar();

        st = conectado.prepareStatement("INSERT INTO tbproducts (id, name, brand, price) VALUES (?, ?, ?, ?)");

        st.setString(1, product.getId());
        st.setString(2, product.getName());
        st.setString(3, product.getBrand());
        st.setDouble(4, product.getPrice());

        st.executeUpdate();
    }
}
