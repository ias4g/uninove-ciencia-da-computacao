<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@ page import="java.util.List" %>
<%@ page import="model.Product" %>
<%@ page import="dao.UserDAO" %>
<%@page import="java.time.format.DateTimeFormatter"%>

<%
    List<Product> productList = UserDAO.getAllProducts();
    request.setAttribute("productList", productList);
%>


<!DOCTYPE html>
<html lang="pt-br">
    <head>
        <title>Listagem de produtos</title>
        <meta charset="UTF-8">
        <meta name="viewport" content="width=device-width, initial-scale=1.0">

        <script src="https://cdn.tailwindcss.com"></script>
    </head>
    <body>
        <div class="max-w-3xl mx-auto">
            <h2 class="font-bold tracking-tight my-12 text-zinc-900 sm:text-2xl">Lista de produtos</h2>
            <ul role="list" class="divide-y divide-gray-100">
                <% for (Product product : productList) { %>
                <a href="showDatas.jsp?id=<%=product.getId()%>">
                    <li class="flex justify-between gap-x-6 py-5">
                        <div class="flex min-w-0 gap-x-4">
                            <img class="h-12 w-12 flex-none rounded-full bg-gray-50" src="<%= product.getImageURL() %>" alt="">
                            <div class="min-w-0 flex-auto">
                                <p class="text-sm font-semibold leading-6 text-gray-900"><%= product.getName() %></p>
                                <%
                                    DateTimeFormatter formatterOutput = DateTimeFormatter.ofPattern("MMM dd, yyyy");
                                    String registrationDate = product.getRegistrationDate().format(formatterOutput);
                                %>
                                <p class="mt-1 truncate text-xs leading-5 text-gray-500"><%= product.getDescription() %></p>
                            </div>
                        </div>
                        <div class="hidden shrink-0 sm:flex sm:flex-col sm:items-end">
                            <p class="text-sm leading-6 text-gray-900"><%= product.getSupplier() %></p>
                            <p class="mt-1 text-xs leading-5 text-gray-500 uppercase"><%=registrationDate%></p>
                        </div>
                    </li>
                </a>
                <% } %>
            </ul>
        </div>
    </body>
</html>

