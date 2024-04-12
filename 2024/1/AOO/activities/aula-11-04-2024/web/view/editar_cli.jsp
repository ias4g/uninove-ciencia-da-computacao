<%@page import="model.bean.Cliente"%>
<%@page import="java.util.List"%>
<%@page import="java.util.ArrayList"%>
<!DOCTYPE html>
<html lang="en">
    <head>
        <title>CRU MVC - Cadastro</title>
        <meta charset="utf-8">
        <meta http-equiv="X-UA-Compatible" content="IE=edge">
        <meta name="viewport" content="width=device-width, initial-scale=1">

        <link rel="shortcut icon" href="favicon.ico" type="image/x-icon">
        <link rel="icon" href="favicon.ico" type="image/x-icon">

        <!-- Chamada ao css do framework Bootstrap -->
        <link href="view/bootstrap/css/bootstrap.min.css" rel="stylesheet">

        <!-- jQuery necessaria para o funcionamento do Bootstrap -->
        <script src="view/bootstrap/js/jquery-1.11.1.js"></script>

        <!-- Chamada ao framework Bootstrap -->
        <script src="view/bootstrap/js/bootstrap.min.js"></script>

    </head>
    <body>
        <!-- Menu de navega��o fixo no topo -->
        <nav class="navbar navbar-inverse" role="navigation">
            <div class="navbar-header">
                <button type="button" class="navbar-toggle" data-toggle="collapse" 
                        data-target="#example-navbar-collapse">
                    <span class="sr-only">Toggle navigation</span>
                    <span class="icon-bar"></span>
                    <span class="icon-bar"></span>
                    <span class="icon-bar"></span>
                </button>
                <a class="navbar-brand" href="index.jsp">CRUD MVC JSP</a>
            </div>
            <div id="navbar" class="navbar-collapse collapse">
                <ul class="nav navbar-nav navbar-left">
                    <li><a href="index.jsp">Home<span class="sr-only"></span></a></li>
                </ul>
            </div><!--/.nav-collapse -->
        </nav>

        <!-- Painel do cadastro -->
        <div class="container col-md-6 col-md-offset-3">
            <div class="panel panel-primary">
                <div class="panel-heading">
                    <h3 class="panel-title h1">Edi��o do Registro</h3>
                </div>
                <div class="panel-body">
                    <form name="form_mvc" class="form-horizontal" action="ControleCliente" method="post">
                        <%
                            /**
                             * Cria uma lista para receber os registros do
                             * atributo listaPessoas originado do servlet
                             * Controle
                             */
                            List<Cliente> cli = (ArrayList) request.getAttribute("listaClientes");

                            // Percorre a lista dos registros e apresenta no navegador
                            for (Cliente c : cli) {
                        %>                              
                        <fieldset>
                            <div class="form-group">
                                <label for="inputNome" class="col-lg-2 control-label">Nome</label>
                                <div class="col-lg-10">
                                    <input type="text" class="form-control" id="inputNome" name="nome" placeholder="Digite seu nome" value="<%=c.getNome()%>">
                                </div>
                            </div>
                            <div class="form-group">
                                <label for="inputTelefone" class="col-lg-2 control-label">Telefone</label>
                                <div class="col-lg-10">
                                    <input type="text" class="form-control" id="inputTelefone" name="telefone" placeholder="Digite seu telefone" value="<%=c.getTelefone()%>">
                                </div>
                            </div>
                            <div class="form-group">
                                <label for="inputValor" class="col-lg-2 control-label">Valor �ltima Venda</label>
                                <div class="col-lg-10">
                                    <input type="text" class="form-control" id="inputValor" name="valor" value="<%=c.getValorUltimaVenda()%>" >
                                </div>
                            </div>
                            <div class="form-group">
                                <div class="col-lg-6 col-lg-offset-2">
                                    <button type="submit" name="acao" class="btn btn-primary" value="alterar_cli">Salvar</button>
                                </div>
                            </div>
                        </fieldset>
                        <input type="hidden" name="id" value="<%=c.getId()%>">
                        <%
                            } // Fim do la�o de repeti��o
                        %>                        
                    </form>        
                </div>      
            </div>                
        </div>
    </body>
</html>

