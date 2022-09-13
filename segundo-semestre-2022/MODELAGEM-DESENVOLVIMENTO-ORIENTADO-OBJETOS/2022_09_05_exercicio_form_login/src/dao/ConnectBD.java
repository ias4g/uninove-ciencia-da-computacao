package dao;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class ConnectBD {

    //Metodo responsavel por estabelecer a conexão com o banco de dados.
    public static Connection connect() {

        Connection conn = null;

        //Configura o driver de conexão ao banco.
        final String DRIVER = "com.mysql.cj.jdbc.Driver";

        //Armazenando informações do banco de dados.
        final String USER = "student";
        final String PASSWORD = "Izael@student";
        final String URL = "jdbc:mysql://localhost:3306/bdsystem";

        try {

            //Estabelecendo a conexão com o banco de dados.
            Class.forName(DRIVER);
            conn = DriverManager.getConnection(URL, USER, PASSWORD);
            return conn;

        } catch (ClassNotFoundException ex) {
            //A linha abaixo serve de apoio para esclarecer os erros.
            System.out.println(ex);
            return null;
        } catch (SQLException ex) {
            //A linha abaixo serve de apoio para esclarecer os erros.
            System.out.println(ex);
            return null;
        }
    }
}
