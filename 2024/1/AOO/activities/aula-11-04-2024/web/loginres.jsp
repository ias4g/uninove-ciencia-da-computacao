<%
    String acao = request.getParameter("acao");
    String u = request.getParameter("usuario");
    String s = request.getParameter("senha");
    if (acao.equals("Login")) {
        if (u.equals("admin") && s.equals("admin")) {
            session.setAttribute("usuario", u);
        } else {
            application.setAttribute("mensagem", 
                    "Usu�rio ou senha n�o confere!");
        }
    } else if (acao.equals("Logoff")) {
        application.removeAttribute("mensagem");
        session.invalidate();
    }
    response.sendRedirect("index.jsp");
%>



