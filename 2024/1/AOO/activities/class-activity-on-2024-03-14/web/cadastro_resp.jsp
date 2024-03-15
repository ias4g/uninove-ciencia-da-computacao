<%@page import="model.Aluno"%>
<%@page contentType="text/html" pageEncoding="UTF-8"%>


<%
    Aluno a = new Aluno();
    a = (Aluno) request.getAttribute("return_student");
%>

<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>Resposta cadastro</title>
    </head>
    <body>
        <h1>Hello World!</h1>
        <pre>
            --- RESPOSTA DO CADSTRO DO ALUNO ---

            NOME: <%=a.getNome()%>

            NOTA1:<%=a.getNota1()%>

            NOTA2:<%=a.getNota2()%>

            MEDIA: <%=a.getMedia()%>


            SITUACAO: <%=a.getSituacao()%>
        </pre>
    </body>
</html>
