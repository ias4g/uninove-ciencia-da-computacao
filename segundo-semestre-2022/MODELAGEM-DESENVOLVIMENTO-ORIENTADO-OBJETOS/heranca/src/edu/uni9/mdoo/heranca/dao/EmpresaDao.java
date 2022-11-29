package edu.uni9.mdoo.heranca.dao;

import edu.uni9.mdoo.heranca.models.Cliente;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;

public class EmpresaDao {

    private Connection conn = null;
    private PreparedStatement stmt = null;

    private final String BD_USER = "student";
    private final String BD_PASSWORD = "Izael@student";
    private final String BD_URL = "jdbc:mysql://localhost:3306/emp_her";
    private final String BD_DRIVER = "com.mysql.cj.jdbc.Driver";

    private void getConn() throws ClassNotFoundException, SQLException {
        Class.forName(BD_DRIVER);
        conn = DriverManager.getConnection(BD_URL, BD_USER, BD_PASSWORD);
    }

    public void salvarCliente(Cliente cliente) throws ClassNotFoundException, SQLException {

        getConn();

        String sql = "INSERT INTO cliente(nome, endereco, telefone, email, dataCompra, cupomDesconto) values(?, ?, ?, ?, ?, ?)";

        stmt = conn.prepareStatement(sql);

        stmt.setString(1, cliente.getNome());
        stmt.setString(2, cliente.getEndereco());
        stmt.setString(3, cliente.getTelefone());
        stmt.setString(4, cliente.getEmail());
        stmt.setString(5, cliente.getDataPrimeiroCompra());
        stmt.setString(6, cliente.getCupomDesconto());

        stmt.executeQuery();

    }

}
