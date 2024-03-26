package controller;

import jakarta.servlet.RequestDispatcher;
import java.io.IOException;
import java.io.PrintWriter;
import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import java.text.ParseException;
import java.time.LocalDate;
import java.util.logging.Level;
import java.util.logging.Logger;

import model.Product;

@WebServlet(name = "Controle", urlPatterns = {"/controller"})
public class Controle extends HttpServlet {

    protected void processRequest(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException, ParseException {
        response.setContentType("text/html;charset=UTF-8");
        try (PrintWriter out = response.getWriter()) {

            Product p = new Product();

            p.setName(request.getParameter("name"));
            p.setDescription(request.getParameter("description"));
            p.setCategory(request.getParameter("category"));
            p.setPrice(Double.valueOf(request.getParameter("price")));
            p.setStok(request.getParameter("stock"));
            p.setSku(request.getParameter("sku"));
            p.setSupplier(request.getParameter("supplier"));
            p.setImageURL(request.getParameter("imageUrl"));
            p.setRegistrationDate(LocalDate.now());

            LocalDate date = LocalDate.parse(request.getParameter("expirationDate"));
            p.setExpirationDate(date);

            System.out.println(request.getParameter("name"));
            System.out.println(request.getParameter("description"));
            System.out.println(request.getParameter("category"));
            System.out.println(request.getParameter("price"));
            System.out.println(request.getParameter("stock"));
            System.out.println(request.getParameter("sku"));
            System.out.println(request.getParameter("supplier"));
            System.out.println(request.getParameter("imageUrl"));
            System.out.println(LocalDate.now().toString());
            System.out.println(request.getParameter("expirationDate"));

            request.setAttribute("products", p);

            RequestDispatcher disp = request.getRequestDispatcher("cadastro_resp.jsp");
            disp.forward(request, response);

        }
    }

    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse res) throws ServletException, IOException {
        try {
            processRequest(req, res);
        } catch (ParseException ex) {
            Logger.getLogger(Controle.class.getName()).log(Level.SEVERE, null, ex);
            System.out.println("Ouve um erro no doGet " + ex.getMessage());
        }
    }

    @Override
    protected void doPost(HttpServletRequest req, HttpServletResponse res) throws ServletException, IOException {
        try {
            processRequest(req, res);
        } catch (ParseException ex) {
            Logger.getLogger(Controle.class.getName()).log(Level.SEVERE, null, ex);
            System.out.println("Ouve um erro no doPost " + ex.getMessage());
        }
    }

    @Override
    public String getServletInfo() {
        return "Short description";
    }

}
