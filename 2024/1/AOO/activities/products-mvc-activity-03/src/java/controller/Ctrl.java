package controller;

import dao.UserDAO;
import jakarta.servlet.RequestDispatcher;
import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.io.PrintWriter;
import java.time.LocalDate;

import model.Product;

@WebServlet(name = "Ctrl", urlPatterns = {"/controller"})
public class Ctrl extends HttpServlet {

    protected void processRequest(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        response.setContentType("text/html;charset=UTF-8");
        try (PrintWriter out = response.getWriter()) {
            /*
            List<Product> prod = UserDAO.getAllProducts();;
            for (Product p : prod) {
                System.out.println(p.getName() + " - " + p.getDescription() + " - " + p.getCategory() + " - " + p.getPrice() + " - " + p.getStock() + " - " + p.getSku() + " - " + p.getSupplier() + " - " + p.getRegistrationDate() + " - " + p.getExpirationDate());
            }
             */
            Product p = new Product();

            p.setName(request.getParameter("name"));
            p.setDescription(request.getParameter("description"));
            p.setCategory(request.getParameter("category"));
            p.setPrice(Double.valueOf(request.getParameter("price")));
            p.setStock(Integer.parseInt(request.getParameter("stock")));
            p.setSku(request.getParameter("sku"));
            p.setSupplier(request.getParameter("supplier"));
            p.setImageURL(request.getParameter("imageUrl"));
            p.setRegistrationDate(LocalDate.now());

            LocalDate date = LocalDate.parse(request.getParameter("expirationDate"));

            p.setExpirationDate(date);

            int res = UserDAO.createProducts(p);

            if (res == 1) {
                // Se a operação for bem-sucedida (por exemplo, produto criado com sucesso), redirecione para a página inicial
                response.sendRedirect(request.getContextPath() + "/index.html");
            } else {
                // Se houver algum erro, você pode redirecionar para uma página de erro ou manter o usuário na página atual
                response.sendRedirect(request.getContextPath() + "/error.html");
            }

            System.out.println(res);

            //request.setAttribute("products", p);
            //RequestDispatcher disp = request.getRequestDispatcher("showDatas.jsp");
            // disp.forward(request, response);
        }
    }

    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        processRequest(request, response);
    }

    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        processRequest(request, response);
    }

    @Override
    public String getServletInfo() {
        return "Short description";
    }
}