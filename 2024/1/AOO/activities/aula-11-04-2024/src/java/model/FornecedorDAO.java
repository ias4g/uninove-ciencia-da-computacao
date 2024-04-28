package model;

import model.bean.Fornecedor;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;
import utils.ConnectionFactory;

// COM BASE EM ClienteDAO, fazer FornecedorDAO
public class FornecedorDAO {

    private final Connection conexao;
    PreparedStatement ps = null;
    String sqlSel = "SELECT * FROM CliFor WHERE tipo='Fornecedor' ORDER BY nome ASC;";

    public FornecedorDAO() throws SQLException {
        this.conexao = ConnectionFactory.getInstance().getConnection();
    }

    public String inserir(Fornecedor fornecedor) throws SQLException {
        String sql = "INSERT INTO CliFor "
                + "(nome, telefone, tipo, valorUltOper) "
                + "VALUES (?, ?, ?, ?) ";
        try {
            PreparedStatement psI = conexao.prepareStatement(sql);
            psI.setString(1, fornecedor.getNome());
            psI.setString(2, fornecedor.getTelefone());
            psI.setString(3, fornecedor.getTipo());
            psI.setFloat(4, fornecedor.getValorUltimaCompra());
            psI.execute();
            conexao.close();
            return "Fornecedor incluído com sucesso!";
        } catch (SQLException e) {
            return e.getMessage();
        }
    }

    public List<Fornecedor> editar(Fornecedor fornecedor) throws SQLException {
        String sql = "SELECT * FROM CliFor WHERE id = ?;";

        List lstFornecedor = new ArrayList();

        try {
            PreparedStatement psC = conexao.prepareStatement(sql);
            psC.setInt(1, fornecedor.getId());

            ResultSet rs = psC.executeQuery();
            rs.next();

            fornecedor = new Fornecedor();
            fornecedor.setId(rs.getInt("id"));
            fornecedor.setNome(rs.getString("nome"));
            fornecedor.setTelefone(rs.getString("telefone"));
            fornecedor.setTipo(rs.getString("tipo"));
            fornecedor.setValorUltimaCompra(rs.getFloat("valorUltOper"));

            lstFornecedor.add(fornecedor);
            conexao.close();
        } catch (SQLException e) {
            return null;
        }
        return lstFornecedor;
    }

    public String excluir(Fornecedor fornecedor) throws SQLException {
        String sql = "DELETE FROM CliFor WHERE id = ?;";
        try {
            PreparedStatement psE = conexao.prepareStatement(sql);
            psE.setInt(1, fornecedor.getId());
            psE.executeUpdate();
            conexao.close();
        } catch (SQLException e) {
            return e.getMessage();
        }
        return "Fornecedor excluído com sucesso!";

    }

    public String alterar(Fornecedor fornecedor) {
        String sql = "UPDATE CliFor SET "
                + "nome = ?, telefone = ?, tipo = ?, valorUltOper = ? "
                + "WHERE id = ?;";
        try {
            PreparedStatement psA = conexao.prepareStatement(sql);
            psA.setString(1, fornecedor.getNome());
            psA.setString(2, fornecedor.getTelefone());
            psA.setString(3, fornecedor.getTipo());
            psA.setFloat(4, fornecedor.getValorUltimaCompra());
            psA.setInt(5, fornecedor.getId());
            psA.executeUpdate();
            conexao.close();
        } catch (SQLException e) {
            return e.getMessage();
        }
        return "Fornecedor alterado com sucesso!";
    }

    public List<Fornecedor> pesquisar(Fornecedor f) throws SQLException {
        List lista = listar(f);
        return lista;
    }

    private List listar(Fornecedor f) throws SQLException {
        sqlSel = "SELECT * FROM CliFor "
                + "WHERE nome like ?   "
                + "ORDER BY nome ASC;  ";
        ps = conexao.prepareStatement(sqlSel);
        ps.setString(1, f.getNome());
        return listar();
    }

    public List<Fornecedor> listar() {
        List lista = new ArrayList();
        try {
            if (ps == null) {
                this.ps = conexao.prepareStatement(sqlSel);
            }
            ResultSet rs = ps.executeQuery();
            while (rs.next()) {
                Fornecedor fornecedor = new Fornecedor();

                fornecedor.setId(rs.getInt("id"));
                fornecedor.setNome(rs.getString("nome"));
                fornecedor.setTelefone(rs.getString("telefone"));
                fornecedor.setTipo(rs.getString("tipo"));
                fornecedor.setValorUltimaCompra(rs.getFloat("valorUltOper"));

                lista.add(fornecedor);
            }
            conexao.close();
        } catch (SQLException e) {
            lista = null;
        }
        return lista;
    }
}
