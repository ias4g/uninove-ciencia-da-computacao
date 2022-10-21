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

    public void salvarUsuario(String user, String pass, String name, String lastname, String email, String job) throws ClassNotFoundException, SQLException {
        conectar();

        st = conectado.prepareStatement("INSERT INTO tbusers (user, password, name, lastname, email, job) VALUES (?, ?, ?, ?, ?, ?)");

        st.setString(1, user);
        st.setString(2, pass);
        st.setString(3, name);
        st.setString(4, lastname);
        st.setString(5, email);
        st.setString(6, job);

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

    public ResultSet listarUsuarios() throws ClassNotFoundException, SQLException {
        conectar();

        st = conectado.prepareStatement(
                "SELECT * FROM tbusers"
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

    public void deletarUsuario(String id) throws ClassNotFoundException, SQLException {

        conectar();
        st = conectado.prepareStatement(
                "DELETE FROM tbusers WHERE id = ?"
        );

        st.setString(1, id);

        st.executeUpdate();
    }

    public void alterarUsuario(String user, String pass, String name, String lastname, String email, String job, int id) throws ClassNotFoundException, SQLException {
        conectar();

        st = conectado.prepareStatement("UPDATE tbusers SET user = ?, password = ?, name = ?, lastname = ?, email = ?, job = ? WHERE id = ?");

        st.setString(1, user);
        st.setString(2, pass);
        st.setString(3, name);
        st.setString(4, lastname);
        st.setString(5, email);
        st.setString(6, job);
        st.setInt(7, id);

        st.executeUpdate();
    }
}
