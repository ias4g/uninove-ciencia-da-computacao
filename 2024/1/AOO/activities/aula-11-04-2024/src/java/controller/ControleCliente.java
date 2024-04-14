package controller;

import model.bean.Cliente;
import java.io.IOException;
import java.sql.SQLException;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;
import jakarta.servlet.RequestDispatcher;
import jakarta.servlet.ServletContext;
import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import java.io.File;
import model.ClienteDAO;

@WebServlet(name = "ControleCliente", urlPatterns = {"/ControleCliente"})
public class ControleCliente extends HttpServlet {

    protected void processRequest(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException, SQLException {
        response.setContentType("text/html;charset=UTF-8");

        if (request.getParameter("acao").contains("cadastrar_cli")) {
            Cliente c = new Cliente();
            c.setNome(request.getParameter("nome"));
            c.setTelefone(request.getParameter("telefone"));
            c.setValorUltimaVenda(Float.parseFloat(request.getParameter("valor")));

            try {
                ClienteDAO dao = new ClienteDAO();
                String resultado = dao.inserir(c);
                request.setAttribute("mensagem", resultado);
            } catch (SQLException e) {
                if (e.getErrorCode() == 0) {
                    request.setAttribute("mensagem", "Não foi possível se comunicar com o banco de dados!");
                }
            }
            RequestDispatcher redireciona = request.getRequestDispatcher("view/mensagem.jsp");
            redireciona.forward(request, response);
        }

        if (request.getParameter("acao").contains("pesquisar_cli")) {
            try {
                Cliente c = new Cliente();
                c.setNome("%" + request.getParameter("nome") + "%");
                ClienteDAO dao = new ClienteDAO();
                List clientes = dao.pesquisar(c);
                if (clientes.isEmpty()) {
                    request.setAttribute("mensagem", "Nenhuma ocorrência localizada!");
                    RequestDispatcher redireciona = request.getRequestDispatcher("view/mensagem.jsp");
                    redireciona.forward(request, response);
                } else {
                    request.setAttribute("listaClientes", clientes);
                    RequestDispatcher redireciona = request.getRequestDispatcher("view/listagem_cli.jsp");
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

        if (request.getParameter("acao").contains("editar_cli")) {
            try {
                Cliente c = new Cliente();
                c.setId(Integer.parseInt(request.getParameter("id")));
                ClienteDAO dao = new ClienteDAO();
                List clientes = dao.editar(c);
                request.setAttribute("listaClientes", clientes);
                RequestDispatcher redireciona = request.getRequestDispatcher("view/editar_cli.jsp");
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
                Cliente c = new Cliente();
                c.setId(Integer.parseInt(request.getParameter("id")));
                ClienteDAO dao = new ClienteDAO();
                String mensagem = dao.excluir(c);
                request.setAttribute("mensagem", mensagem);
                response.setHeader("Refresh", "5; url=\"ControleCliente?acao=listar_cli\"");
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

        if (request.getParameter("acao").contains("listar_cli")) {

            //String caminhoBancoDeDados;
            //ServletContext servletContext = getServletContext();
            //String caminhoSrc = servletContext.getRealPath("/src");
            //File pastaSrc = new File(caminhoSrc);
            //if (pastaSrc.exists() && pastaSrc.isDirectory()) {
            //    caminhoBancoDeDados = "Caminho da pasta src: " + caminhoSrc;
            //} else {
            //    caminhoBancoDeDados = "A pasta src não foi encontrada.";
            //}
            
            try {
                ClienteDAO dao = new ClienteDAO();
                List clientes = dao.listar();
                if (clientes.isEmpty()) {
                    request.setAttribute("mensagem", "Não há registros para serem exibidos!");
                    RequestDispatcher redireciona = request.getRequestDispatcher("cadastrar_cli.jsp");
                    redireciona.forward(request, response);
                } else {
                    request.setAttribute("listaClientes", clientes);
                    RequestDispatcher redireciona = request.getRequestDispatcher("view/listagem_cli.jsp");
                    redireciona.forward(request, response);
                }
            } catch (SQLException e) {
                if (e.getErrorCode() == 0) {
                    request.setAttribute("mensagem", "Não foi possível se comunicar com o banco de dados! listar_cli");
                    RequestDispatcher redireciona = request.getRequestDispatcher("view/mensagem.jsp");
                    redireciona.forward(request, response);
                }
            }
        }

        if (request.getParameter("acao").contains("alterar_cli")) {
            try {
                Cliente c = new Cliente();
                c.setId(Integer.parseInt(request.getParameter("id")));
                c.setNome(request.getParameter("nome"));
                c.setTelefone(request.getParameter("telefone"));
                c.setValorUltimaVenda(Float.parseFloat(request.getParameter("valor")));
                ClienteDAO dao = new ClienteDAO();
                String mensagem = dao.alterar(c);
                response.setHeader("Refresh", "5; url=\"ControleCliente?acao=listar_cli\"");
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
            Logger.getLogger(ControleCliente.class.getName()).log(Level.SEVERE, null, ex);
        }
    }

    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        try {
            processRequest(request, response);
        } catch (SQLException ex) {
            Logger.getLogger(ControleCliente.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
}
