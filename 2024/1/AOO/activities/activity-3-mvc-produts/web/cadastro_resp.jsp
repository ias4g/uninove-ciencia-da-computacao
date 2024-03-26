<%@page import="model.Product"%>
<%@page import="java.time.format.DateTimeFormatter"%>
<%@page contentType="text/html" pageEncoding="UTF-8"%>


<%
    Product p = new Product();
    p = (Product) request.getAttribute("products");
    
    DateTimeFormatter formatterInput = DateTimeFormatter.ofPattern("yyyy-MM-dd");
    DateTimeFormatter formatterOutput = DateTimeFormatter.ofPattern("dd/MM/yyyy");
    
    LocalDate date = LocalDate.parse(dateString, formatterInput);
    String formattedDate = date.format(formatterOutput);
%>

<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>Resposta cadastro</title>
    </head>
    <body>
        <h1>Produtos</h1>
        <pre>
            NAME: <%=p.getName()%>

            DESCRIPTION:<%=p.getDescription()%>

            CATEGORY:<%=p.getCategory()%>

            PRICE <%=p.getPrice()%>

            QUNTITY STOKE <%=p.getStok()%>

            SKU: <%=p.getSku()%>

            SUPPLIER: <%=p.getSupplier()%>
            
            IMAGE: <img src="<%=p.getImageURL()%>" width="128" alt="alt"/>
        </pre> 

    </body>
</html>
