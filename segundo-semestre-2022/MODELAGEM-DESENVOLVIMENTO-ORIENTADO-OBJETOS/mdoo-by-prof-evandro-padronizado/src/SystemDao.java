
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.PreparedStatement;
import java.sql.ResultSet;

public class SystemDao {

    private Connection conectado;
    private PreparedStatement st;
    private ResultSet resultado;

    private void conectar() throws ClassNotFoundException, SQLException {

        Class.forName("com.mysql.cj.jdbc.Driver");

        conectado = DriverManager.getConnection(
                "jdbc:mysql://localhost:3306/bdsystem", "student", "Izael@student"
        );
    }

}
