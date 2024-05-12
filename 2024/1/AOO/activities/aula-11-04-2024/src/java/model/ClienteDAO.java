package model;

import model.bean.Cliente;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;
import utils.ConnectionFactory;

public class ClienteDAO {

    private final Connection conexao;
    PreparedStatement ps = null;
    String sqlSel = "SELECT * FROM CliFor WHERE tipo='Cliente' ORDER BY nome ASC";

    public ClienteDAO() throws SQLException {
        //try {
        this.conexao = ConnectionFactory.getInstance().getConnection();
        //} catch (SQLException eee) {
        //    System.out.println(eee.getMessage());
        //}
    }

    public String inserir(Cliente c) throws SQLException {
        String sql = "INSERT INTO CliFor "
                + "(nome, telefone, email, tipo, valorUltOper) "
                + "VALUES (?, ?, ?, ?, ?) ";
        try {
            PreparedStatement psI = conexao.prepareStatement(sql);
            psI.setString(1, c.getNome());
            psI.setString(2, c.getTelefone());
            psI.setString(3, c.getEmail());
            psI.setString(4, c.getTipo());
            psI.setFloat(5, c.getValorUltimaVenda());
            psI.execute();
            conexao.close();
            return "Cliente '<b>" + c.getNome() + "</b>' incluído com sucesso!";
        } catch (SQLException e) {
            return e.getMessage();
        }
    }

    public List<Cliente> editar(Cliente c) throws SQLException {

        String sql = "SELECT * FROM CliFor WHERE id = ?";

        List lstCliente = new ArrayList();

        try {
            PreparedStatement psC = conexao.prepareStatement(sql);
            psC.setInt(1, c.getId());

            ResultSet rs = psC.executeQuery();
            rs.next();

            c = new Cliente();
            c.setId(rs.getInt("id"));
            c.setNome(rs.getString("nome"));
            c.setTelefone(rs.getString("telefone"));
            c.setEmail(rs.getString("email"));
            c.setTipo(rs.getString("tipo"));
            c.setValorUltimaVenda(rs.getFloat("valorUltOper"));

            lstCliente.add(c);
            conexao.close();
        } catch (SQLException e) {
            return null;
        }
        return lstCliente;
    }

    public String excluir(Cliente p) throws SQLException {
        String sql = "DELETE FROM CliFor WHERE id = ?";
        try {
            PreparedStatement psE = conexao.prepareStatement(sql);
            psE.setInt(1, p.getId());
            psE.executeUpdate();
            conexao.close();
        } catch (SQLException e) {
            return e.getMessage();
        }
        return "Cliente excluído com sucesso!";
    }

    public String alterar(Cliente p) {
        String sql = "UPDATE CliFor SET "
                + "nome = ?, telefone = ?, email = ?, tipo = ?, valorUltOper = ? "
                + "WHERE id = ?";
        try {
            PreparedStatement psA = conexao.prepareStatement(sql);
            psA.setString(1, p.getNome());
            psA.setString(2, p.getTelefone());
            psA.setString(3, p.getEmail());
            psA.setString(4, p.getTipo());
            psA.setFloat(5, p.getValorUltimaVenda());
            psA.setInt(6, p.getId());
            psA.executeUpdate();
            conexao.close();
        } catch (SQLException e) {
            return e.getMessage();
        }
        return "Cliente '<b>" + p.getNome() + "</b>' alterado com sucesso!";
    }

    public List<Cliente> pesquisar(Cliente p) throws SQLException {
        List lista = listar(p);
        return lista;
    }

    private List listar(Cliente p) throws SQLException {
        sqlSel = "SELECT * FROM CliFor "
                + "WHERE nome like ?   "
                + "ORDER BY nome ASC  ";
        ps = conexao.prepareStatement(sqlSel);
        ps.setString(1, p.getNome());
        return listar();
    }

    public List<Cliente> listar() {
        List lista = new ArrayList();
        try {
            if (ps == null) {
                this.ps = conexao.prepareStatement(sqlSel);
            }
            ResultSet rs = ps.executeQuery();
            while (rs.next()) {
                Cliente cliente = new Cliente();

                cliente.setId(rs.getInt("id"));
                cliente.setNome(rs.getString("nome"));
                cliente.setTelefone(rs.getString("telefone"));
                cliente.setEmail(rs.getString("email"));
                cliente.setTipo(rs.getString("tipo"));
                cliente.setValorUltimaVenda(rs.getFloat("valorUltOper"));

                lista.add(cliente);
            }
            conexao.close();
        } catch (SQLException e) {
            lista = null;
        }
        return lista;
    }
}
