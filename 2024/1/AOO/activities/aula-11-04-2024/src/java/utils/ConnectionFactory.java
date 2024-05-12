package utils;

import java.io.File;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class ConnectionFactory {

    String projectDir = System.getProperty("user.dir");
    String dbPath = projectDir + File.separator + "bd" + File.separator + "db.db";

    private final String driver = "org.sqlite.JDBC";
    private final String url = "jdbc:sqlite:" + dbPath;

    private static ConnectionFactory connectionFactory = null;

    private ConnectionFactory() throws SQLException {
        try {
            // Configura o driver para a conexão
            Class.forName(driver);
        } catch (ClassNotFoundException e) {
            throw new SQLException("driver");
        }
    }

    public Connection getConnection() throws SQLException {
        // Variável para receber a conexão
        Connection conn = null;

        try {
            conn = DriverManager.getConnection(url);
        } catch (SQLException e) {
            throw new SQLException(String.valueOf(e.getMessage()));
        }

        // Retorna uma conexão caso ocorra sucesso
        return conn;
    }

    public static ConnectionFactory getInstance() throws SQLException {
        if (connectionFactory == null) {
            connectionFactory = new ConnectionFactory();
        }
        return connectionFactory;
    }
}
