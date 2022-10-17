
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.PreparedStatement;
import java.sql.ResultSet;

public class SystemDao {

    private Connection conectado;
    private PreparedStatement st;
    private ResultSet resultado;

    private final String URL = "jdbc:mysql://localhost:3306/bdsystem";
    private final String PASS = "Izael@student";
    private final String USER = "student";

    private void conectar() throws ClassNotFoundException, SQLException {

        Class.forName("com.mysql.cj.jdbc.Driver");

        conectado = DriverManager.getConnection(URL, USER, PASS);
    }

}
