package controller;

import java.io.IOException;
import java.sql.SQLException;
import jakarta.servlet.RequestDispatcher;
import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import model.FornecedorDAO;
import model.bean.Fornecedor;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;

@WebServlet(name = "ControleFornecedor", urlPatterns = {"/ControleFornecedor"})
public class ControleFornecedor extends HttpServlet {

    protected void processRequest(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException, SQLException {
        response.setContentType("text/html;charset=UTF-8");

        if (request.getParameter("acao").contains("cadastrar_for")) {
            Fornecedor f = new Fornecedor();
            f.setNome(request.getParameter("nome"));
            f.setTelefone(request.getParameter("telefone"));
            f.setEmail(request.getParameter("email"));
            f.setValorUltimaCompra(Float.parseFloat(request.getParameter("valor")));
            // TODO - Continuar codigicação para fornecedores...
            try {
                FornecedorDAO dao = new FornecedorDAO();
                String resultado = dao.inserir(f);
                request.setAttribute("mensagem", resultado);
            } catch (SQLException e) {
                if (e.getErrorCode() == 0) {
                    request.setAttribute("mensagem", "Não foi possível se comunicar com o banco de dados!");
                }
            }
            RequestDispatcher redireciona = request.getRequestDispatcher("view/mensagem.jsp");
            redireciona.forward(request, response);
        }

        if (request.getParameter("acao").contains("pesquisar_for")) {
            try {
                Fornecedor f = new Fornecedor();
                f.setNome("%" + request.getParameter("nome") + "%");
                FornecedorDAO dao = new FornecedorDAO();
                List fornecedores = dao.pesquisar(f);
                if (fornecedores.isEmpty()) {
                    request.setAttribute("mensagem", "Nenhuma ocorrência localizada!");
                    RequestDispatcher redireciona = request.getRequestDispatcher("view/mensagem.jsp");
                    redireciona.forward(request, response);
                } else {
                    request.setAttribute("listaFornecedores", fornecedores);
                    RequestDispatcher redireciona = request.getRequestDispatcher("view/listagem_for.jsp");
                    redireciona.forward(request, response);
                }
            } catch (SQLException e) {
                if (e.getErrorCode() == 0) {
                    request.setAttribute("mensagem", "Não foi possível se comunicar com o banco de dados!");
                    RequestDispatcher redireciona = request.getRequestDispatcher("view/mensagem.jsp");
                    redireciona.forward(request, response);
                }
            }
        }

        if (request.getParameter("acao").contains("editar_for")) {
            try {
                Fornecedor f = new Fornecedor();
                f.setId(Integer.parseInt(request.getParameter("id")));
                FornecedorDAO dao = new FornecedorDAO();
                List fornecedores = dao.editar(f);
                request.setAttribute("listaFornecedores", fornecedores);
                RequestDispatcher redireciona = request.getRequestDispatcher("view/editar_for.jsp");
                redireciona.forward(request, response);
            } catch (SQLException e) {
                if (e.getErrorCode() == 0) {
                    request.setAttribute("mensagem", "Não foi possível se comunicar com o banco de dados!");
                    RequestDispatcher redireciona = request.getRequestDispatcher("view/mensagem.jsp");
                    redireciona.forward(request, response);
                }
            }
        }

        if (request.getParameter("acao").contains("excluir")) {
            try {
                Fornecedor f = new Fornecedor();
                f.setId(Integer.parseInt(request.getParameter("id")));
                FornecedorDAO dao = new FornecedorDAO();
                String mensagem = dao.excluir(f);
                request.setAttribute("mensagem", mensagem);
                response.setHeader("Refresh", "5; url=\"ControleFornecedor?acao=listar_for\"");
                RequestDispatcher redireciona = request.getRequestDispatcher("view/mensagem.jsp");
                redireciona.forward(request, response);
            } catch (SQLException e) {
                if (e.getErrorCode() == 0) {
                    request.setAttribute("mensagem", "Não foi possível se comunicar com o banco de dados!");
                    RequestDispatcher redireciona = request.getRequestDispatcher("view/mensagem.jsp");
                    redireciona.forward(request, response);
                }
            }
        }

        if (request.getParameter("acao").contains("listar_for")) {
            try {
                FornecedorDAO dao = new FornecedorDAO();
                List fornecedores = dao.listar();
                if (fornecedores.isEmpty()) {
                    request.setAttribute("mensagem", "Não há registros para serem exibidos!");
                    RequestDispatcher redireciona = request.getRequestDispatcher("/cadastrar_for.jsp");
                    redireciona.forward(request, response);
                } else {
                    request.setAttribute("listaFornecedores", fornecedores);
                    RequestDispatcher redireciona = request.getRequestDispatcher("view/listagem_for.jsp");
                    redireciona.forward(request, response);
                }
            } catch (SQLException e) {
                if (e.getErrorCode() == 0) {
                    request.setAttribute("mensagem", "Não foi possível se comunicar com o banco de dados!");
                    RequestDispatcher redireciona = request.getRequestDispatcher("view/mensagem.jsp");
                    redireciona.forward(request, response);
                }
            }
        }

        if (request.getParameter("acao").contains("alterar_for")) {
            try {
                Fornecedor f = new Fornecedor();
                f.setId(Integer.parseInt(request.getParameter("id")));
                f.setNome(request.getParameter("nome"));
                f.setTelefone(request.getParameter("telefone"));
                f.setEmail(request.getParameter("email"));
                f.setValorUltimaCompra(Float.parseFloat(request.getParameter("valor")));
                // TODO - Continuar codigicação para fornecedores...
                FornecedorDAO dao = new FornecedorDAO();
                String mensagem = dao.alterar(f);
                response.setHeader("Refresh", "5; url=\"ControleFornecedor?acao=listar_for\"");
                request.setAttribute("mensagem", mensagem);
                RequestDispatcher redireciona = request.getRequestDispatcher("view/mensagem.jsp");
                redireciona.forward(request, response);
            } catch (SQLException e) {
                if (e.getErrorCode() == 0) {
                    request.setAttribute("mensagem", "Não foi possível se comunicar com o banco de dados!");
                    RequestDispatcher redireciona = request.getRequestDispatcher("view/mensagem.jsp");
                    redireciona.forward(request, response);
                }
            }
        }
    }

    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        try {
            processRequest(request, response);

        } catch (SQLException ex) {
            Logger.getLogger(ControleFornecedor.class.getName()).log(Level.SEVERE, null, ex);
        }
    }

    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        try {
            processRequest(request, response);
        } catch (SQLException ex) {
            Logger.getLogger(ControleFornecedor.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
}
