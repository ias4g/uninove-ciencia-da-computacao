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
        <!-- Menu de navegaÃ§Ã£o fixo no topo -->
        <nav class="navbar navbar-inverse" role="navigation">
            <div class="navbar-header">
                <button type="button" class="navbar-toggle" data-toggle="collapse" 
                        data-target="#example-navbar-collapse">
                    <span class="sr-only">Toggle navigation</span>
                    <span class="icon-bar"></span>
                    <span class="icon-bar"></span>
                    <span class="icon-bar"></span>
                </button>
                <a class="navbar-brand" href="index.jsp">CRUD MVC JSP - Java DB</a>
            </div>
            <div id="navbar" class="navbar-collapse collapse">
                <ul class="nav navbar-nav navbar-left">
                    <li><a href="ControleCliente?acao=listar_cli">Clientes<span class="sr-only"></span></a></li>
                    <li><a href="ControleFornecedor?acao=listar_for">Fornecedores<span class="sr-only"></span></a></li>
                    <li class="right" ><%@include file="login.jsp" %></li>
                </ul>
            </div>
            <!--/.nav-collapse -->
        </nav>

        <!-- Tela inicial -->
        <div class="container col-md-6 col-md-offset-3">
            <div class="panel panel-primary">
                <div class="panel-heading">
                    <h3 class="panel-title h1">Informações</h3>
                </div>
                <div class="panel-body text-justify">
                    <h4>
                        Este é um exemplo de implementação de um sistema de <strong>Cadastro de 
                            Pessoas</strong> utilizando o modelo MVC com conexão ao banco de dados MySql.
                    </h4>
                    <h4>
                        No Menu (topo da tela) estão algumas opções do CRUD para manipulação dos dados.
                        As demais (Editar e Excluir) estão disponíveis após uma Pesquisa ou Listagem 
                        de Todos os Registros.
                    </h4>
                    <h4>
                        Após o estudo completo deste exemplo, é aconselhável que você implemente as 
                        diversas validações para as entradas de dados, bem como mensagens de erro, 
                        caso ocorram. 
                    </h4>
                </div>  

            </div>                
        </div>        
    </body>
</html>
