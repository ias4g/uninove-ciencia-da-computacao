<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>Laço While</title>
    </head>
    <body>
        <h1>While</h1>
        
        <%
            int ct = 0;
            
            while(ct < 5){
                out.println("<li>" + ct + "</li>");
                ct++;
            }
        %>
        
        <hr>
        
        <h1>Do While</h1>
        
        <%
            int ct2 = 0;
            
            do{
                out.println("<li>" + ct + "</li>");
                ct++;
            } while(ct < 5);
        %>
        
        <hr>
        
        <h1>FOR</h1>
        <%
            for(int i = 0; i <= 10; i++){
                out.println("<li>" + i + "</li>");
            }
        %>
    </body>
</html>
