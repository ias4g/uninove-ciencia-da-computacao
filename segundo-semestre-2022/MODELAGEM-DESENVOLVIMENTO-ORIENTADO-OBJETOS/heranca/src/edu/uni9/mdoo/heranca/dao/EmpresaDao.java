package edu.uni9.mdoo.heranca.dao;

import edu.uni9.mdoo.heranca.models.Cliente;
import edu.uni9.mdoo.heranca.models.Funcionario;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.sql.ResultSet;
import java.util.ArrayList;
import java.util.List;

public class EmpresaDao {

    private ResultSet rs = null;
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

    public Cliente buscarClientePorId(int id) throws ClassNotFoundException, SQLException {

        getConn();

        Cliente cl = new Cliente();

        String sql = "SELECT * FROM cliente WHERE id = ?";
        stmt = conn.prepareStatement(sql);
        stmt.setInt(1, id);
        rs = stmt.executeQuery();

        if (rs == null) {
            return null;
        }

        while (rs.next()) {

            cl.setId(Integer.valueOf(rs.getString("id")));
            cl.setNome(rs.getString("nome"));
            cl.setEndereco(rs.getString("endereco"));
            cl.setTelefone(rs.getString("telefone"));
            cl.setEmail(rs.getString("email"));
            cl.setDataCompra(rs.getString("dataCompra"));
            cl.setCupomDesconto(rs.getString("cupomDesconto"));

        }

        return cl;

    }

    public List<Cliente> buscarTodosClientes() throws ClassNotFoundException, SQLException {

        getConn();

        List<Cliente> resultData = new ArrayList<>();

        String sql = "SELECT * FROM cliente";
        stmt = conn.prepareStatement(sql);
        rs = stmt.executeQuery();

        if (rs == null) {
            return null;
        }

        while (rs.next()) {

            Cliente cl = new Cliente();

            cl.setId(Integer.valueOf(rs.getString("id")));
            cl.setNome(rs.getString("nome"));
            cl.setEndereco(rs.getString("endereco"));
            cl.setTelefone(rs.getString("telefone"));
            cl.setEmail(rs.getString("email"));
            cl.setDataCompra(rs.getString("dataCompra"));
            cl.setCupomDesconto(rs.getString("cupomDesconto"));

            resultData.add(cl);

        }

        return resultData;

    }

    public Funcionario buscarFuncionarioPorId(int id) throws ClassNotFoundException, SQLException {

        getConn();

        Funcionario func = new Funcionario();

        String sql = "SELECT * FROM funcionario WHERE id = ?";
        stmt = conn.prepareStatement(sql);
        stmt.setInt(1, id);
        rs = stmt.executeQuery();

        if (rs == null) {
            return null;
        }

        while (rs.next()) {

            func.setId(Integer.valueOf(rs.getString("id")));
            func.setNome(rs.getString("nome"));
            func.setEndereco(rs.getString("endereco"));
            func.setTelefone(rs.getString("telefone"));
            func.setEmail(rs.getString("email"));
            func.setCargo(rs.getString("cargo"));
            func.setSalario(Double.valueOf(rs.getString("salario")));

        }

        return func;

    }

    public List<Funcionario> buscarTodosFuncionarios() throws ClassNotFoundException, SQLException {

        getConn();

        List<Funcionario> resultData = new ArrayList<>();

        String sql = "SELECT * FROM funcionario";
        stmt = conn.prepareStatement(sql);
        rs = stmt.executeQuery();

        if (rs == null) {
            return null;
        }

        while (rs.next()) {

            Funcionario func = new Funcionario();

            func.setId(Integer.valueOf(rs.getString("id")));
            func.setNome(rs.getString("nome"));
            func.setEndereco(rs.getString("endereco"));
            func.setTelefone(rs.getString("telefone"));
            func.setEmail(rs.getString("email"));
            func.setCargo(rs.getString("cargo"));
            func.setSalario(Double.valueOf(rs.getString("salario")));

            resultData.add(func);

        }

        return resultData;

    }

    public void alterarCliente(Cliente cl) throws ClassNotFoundException, SQLException {

        getConn();

        String sql = "UPDATES cliente SET nome = ?, endereco = ?, telefone = ?, email = ?, dataCompra = ?, cupomDesconto = ? WHERE id = ?";

        stmt = conn.prepareStatement(sql);

        stmt.setString(1, cl.getNome());
        stmt.setString(2, cl.getEndereco());
        stmt.setString(3, cl.getTelefone());
        stmt.setString(4, cl.getEmail());
        stmt.setString(5, cl.getDataCompra());
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
