<%@page import="model.Product"%>
<%@page import="java.time.format.DateTimeFormatter"%>
<%@page import="java.text.NumberFormat"%>
<%@page import="java.util.Locale"%>
<%@page import="dao.UserDAO" %>
<%@page contentType="text/html" pageEncoding="UTF-8"%>


<%
    String id = request.getParameter("id");
    
    Product p = UserDAO.getProductId(Integer.parseInt(id));
     
    DateTimeFormatter formatterOutput = DateTimeFormatter.ofPattern("MMM dd, yyyy");
    
    String registrationDate = p.getRegistrationDate().format(formatterOutput);
    String expirationDate = p.getExpirationDate().format(formatterOutput);
    
    // Criando um objeto Locale para o Brasil
    Locale localeBR = new Locale("pt", "BR");

    // Criando um NumberFormat para o Real brasileiro
    NumberFormat currencyFormat = NumberFormat.getCurrencyInstance(localeBR);

    // Formatando o número para o formato de moeda brasileira
    String formattedCurrent = currencyFormat.format(p.getPrice());
%>

<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>Detalhes do produto</title>

        <script src="https://cdn.tailwindcss.com"></script>
        <link href="https://fonts.googleapis.com/icon?family=Material+Icons" rel="stylesheet">
    </head>
    <body>

        <div class="bg-white max-w-5xl m-auto p-16 pt-16">
            <div class="mx-auto lg:mx-0">
                <h2 class="text-3xl font-bold tracking-tight text-gray-900 sm:text-4xl">Detalhes do produto</h2>
                <p class="mt-2 text-lg line-clamp-1 leading-8 text-gray-600"><%=p.getDescription()%></p>
            </div>
            <div class="border-t border-gray-200 sm:mt-6 sm:pt-8 lg:mx-0 lg:max-w-none lg:grid-cols-3">
                <article class="flex flex-col items-start justify-between">
                    <div class="flex justify-between gap-12 w-full">
                        <div>
                            <div class="flex items-center gap-x-4 text-xs">
                                <time datetime="<%=registrationDate%>" class="text-gray-500 uppercase"><%=registrationDate%></time>
                                <span class="relative z-10 rounded-full bg-gray-50 px-3 p-1.5 font-medium text-gray-600">
                                    <%=p.getCategory()%>
                                </span>
                                <span class="relative z-10 rounded-full bg-gray-50 px-3 p-1.5 font-medium text-gray-600 uppercase">
                                    <%=formattedCurrent%>
                                </span>
                            </div>
                            <div class="group relative">
                                <h3 class="mt-3 text-lg font-semibold leading-6 text-gray-900 group-hover:text-gray-600">
                                    <span>
                                        <span class="absolute inset-0"></span>
                                        <%=p.getName()%>
                                    </span>
                                </h3>
                                <p class="mt-5 text-sm text-justify leading-6 text-gray-600">
                                    <%=p.getDescription()%>
                                </p>
                            </div>
                        </div>
                        <img class="bg-zinc-500 rounded-full size-20" src="<%=p.getImageURL()%>" alt="alt"/>
                    </div>

                    <div class="flex w-full justify-between gap-20">
                        <div class="relative mt-8 flex items-center gap-x-1">
                            <span class="material-icons size-12 rounded-full bg-gray-50 text-zinc-500 flex place-content-center items-center">
                                inventory_2
                            </span>
                            <div class="text-sm leading-6">
                                <p class="font-semibold text-gray-900">
                                    <span>
                                        <span class="absolute inset-0"></span>
                                        Estoque
                                    </span>
                                </p>
                                <p class="text-gray-600 text-xs uppercase"><%=p.getStock()%></p>
                            </div>
                        </div>
                        <div class="relative mt-8 flex items-center gap-x-1">
                            <span class="material-icons size-12 rounded-full bg-gray-50 text-zinc-500 flex place-content-center items-center">
                                123
                            </span>
                            <div class="text-sm leading-6">
                                <p class="font-semibold text-gray-900">
                                    <span>
                                        <span class="absolute inset-0"></span>
                                        Sku
                                    </span>
                                </p>
                                <p class="text-gray-600 text-xs uppercase"><%=p.getSku()%></p>
                            </div>
                        </div>
                        <div class="relative mt-8 flex items-center gap-x-1">
                            <span class="material-icons size-12 rounded-full bg-gray-50 text-zinc-500 flex place-content-center items-center">
                                domain
                            </span>
                            <div class="text-sm leading-6">
                                <p class="font-semibold text-gray-900">
                                    <span>
                                        <span class="absolute inset-0"></span>
                                        Fornecedor
                                    </span>
                                </p>
                                <p class="text-gray-600 text-xs uppercase"><%=p.getSupplier()%></p>
                            </div>
                        </div>
                        <div class="relative mt-8 flex items-center gap-x-1">
                            <span class="material-icons size-12 rounded-full font-medium bg-gray-50 text-zinc-500 flex place-content-center items-center">
                                event_busy
                            </span>
                            <div class="text-sm leading-6">
                                <p class="font-semibold text-gray-900">
                                    <span>
                                        <span class="absolute"></span>
                                        Vencimento
                                    </span>
                                </p>
                                <p class="text-gray-600 text-xs uppercase"><%=expirationDate%></p>
                            </div>
                        </div>
                    </div>
                </article>
            </div>
            <div class="mt-12 flex items-center justify-end mx-auto lg:mx-0">
                <a href="./index.html" class="rounded-md bg-blue-700 px-3.5 py-2.5 text-sm font-semibold text-white shadow-sm hover:bg-blue-600 focus-visible:outline focus-visible:outline-2 focus-visible:outline-offset-2 focus-visible:outline-white">Ir para home</a>
            </div>
        </div>
    </body>
</html>
