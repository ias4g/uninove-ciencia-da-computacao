<%-- 
    Document   : test-condicional
    Created on : 21 de mar de 2024, 20:36:57
    Author     : Izael Silva
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>JSP Page</title>
    </head>
    <body>
        <h1>Teste condicional</h1>
        <%
            int mes = 4;
            
            switch(mes){
                case 1:
                case 2:
                case 3:
                    out.println("Primeiro trimestre");
                    break;
                case 4:
                case 5:
                case 6:
                    out.println("Segundo trimestre");
                    break;
                case 7:
                case 8:
                case 9:
                    out.println("Terceiro trimestre");
                    break;
                case 10:
                case 11:
                case 12:
                    out.println("Quarto trimestre");
                    break;
                default:
                    out.println("Mes invalido");
            }
        %>
    </body>
</html>
