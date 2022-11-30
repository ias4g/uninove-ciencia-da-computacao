package edu.uni9.mdoo.heranca.dao;

import edu.uni9.mdoo.heranca.models.Cliente;
import edu.uni9.mdoo.heranca.models.Funcionario;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.util.List;

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

    public void salvarCliente(Cliente cl) throws ClassNotFoundException, SQLException {

        getConn();

        String sql = "INSERT INTO cliente(nome, endereco, telefone, email, dataCompra, cupomDesconto) values(?, ?, ?, ?, ?, ?)";

        stmt = conn.prepareStatement(sql);

        stmt.setString(1, cl.getNome());
        stmt.setString(2, cl.getEndereco());
        stmt.setString(3, cl.getTelefone());
        stmt.setString(4, cl.getEmail());
        stmt.setString(5, cl.getDataPrimeiroCompra());
        stmt.setString(6, cl.getCupomDesconto());

        stmt.executeUpdate();

    }

    public void salvarFuncionario(Funcionario func) throws ClassNotFoundException, SQLException {

        getConn();

        String sql = "INSERT INTO funcionario(nome, endereco, telefone, email, cargo, salario) values(?, ?, ?, ?, ?, ?)";

        stmt = conn.prepareStatement(sql);

        stmt.setString(1, func.getNome());
        stmt.setString(2, func.getEndereco());
        stmt.setString(3, func.getTelefone());
        stmt.setString(4, func.getEmail());
        stmt.setString(5, func.getCargo());
        stmt.setDouble(6, func.getSalario());

        stmt.executeUpdate();

    }

    public List<Cliente> buscarTodosClientes(int id) {
        return null;
    }

    public List<Funcionario> buscarTodosFuncionarios(int id) {
        return null;
    }

    public void alterarCliente(Cliente cl) throws ClassNotFoundException, SQLException {

        getConn();

        String sql = "UPDATES cliente SET nome = ?, endereco = ?, telefone = ?, email = ?, dataCompra = ?, cupomDesconto = ? WHERE id = ?";

        stmt = conn.prepareStatement(sql);

        stmt.setString(1, cl.getNome());
        stmt.setString(2, cl.getEndereco());
        stmt.setString(3, cl.getTelefone());
        stmt.setString(4, cl.getEmail());
        stmt.setString(5, cl.getDataPrimeiroCompra());
        stmt.setString(6, cl.getCupomDesconto());
        stmt.setInt(7, cl.getId());

        stmt.executeUpdate();

    }

    public void alterarFuncionario(Funcionario func) throws ClassNotFoundException, SQLException {

        getConn();

        String sql = "UPDATE funcionario SET nome = ?, endereco = ?, telefone = ?, email = ?, cargo = ?, salario = ? WHERE id = ?";

        stmt = conn.prepareStatement(sql);

        stmt.setString(1, func.getNome());
        stmt.setString(2, func.getEndereco());
        stmt.setString(3, func.getTelefone());
        stmt.setString(4, func.getEmail());
        stmt.setString(5, func.getCargo());
        stmt.setDouble(6, func.getSalario());
        stmt.setInt(7, func.getId());

        stmt.executeUpdate();

    }

    public void deleteCliente(int id) throws ClassNotFoundException, SQLException {

        getConn();

        String sql = "DELETE FROM cliente WHERE id = ?";

        stmt = conn.prepareStatement(sql);

        stmt.setInt(1, id);

        stmt.executeUpdate();

    }

    public void deleteFuncionario(int id) throws ClassNotFoundException, SQLException {

        getConn();

        String sql = "DELETE FROM funcionario WHERE id = ?";

        stmt = conn.prepareStatement(sql);

        stmt.setInt(1, id);

        stmt.executeUpdate();

    }

}
