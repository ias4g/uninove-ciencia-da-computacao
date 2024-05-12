<!DOCTYPE html>
<html lang="pt-br">
    <head>
        <title>CRUD MVC - Cadastro - Java DB</title>
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
        <!-- Menu de navegação fixo no topo -->
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
                    <h3 class="panel-title h1">Novo Cadastro de Cliente</h3>
                </div>
                <div class="panel-body">
                    <form name="form_mvc" class="form-horizontal" action="ControleCliente" method="post">
                        <fieldset>
                            <div class="form-group">
                                <label for="inputNome" class="col-lg-2 control-label">Nome</label>
                                <div class="col-lg-10">
                                    <input type="text" class="form-control" id="inputNome" name="nome" placeholder="Digite seu nome" value="">
                                </div>
                            </div>
                            <div class="form-group">
                                <label for="inputTelefone" class="col-lg-2 control-label">Telefone</label>
                                <div class="col-lg-10">
                                    <input type="text" class="form-control" id="inputTelefone" name="telefone" placeholder="Digite seu telefone" value="">
                                </div>
                            </div>
                            <div class="form-group">
                                <label for="inputEmail" class="col-lg-2 control-label">E-mail</label>
                                <div class="col-lg-10">
                                    <input type="email" class="form-control" id="inputEmail" name="email" placeholder="Digite seu e-mail" value="">
                                </div>
                            </div>
                            <div class="form-group">
                                <label for="inputValor" class="col-lg-2 control-label">Valor �ltima Venda</label>
                                <div class="col-lg-10">
                                    <input type="number" class="form-control" id="inputValor" name="valor" value="" >
                                </div>
                            </div>

                            <div class="form-group">
                                <div class="col-lg-6 col-lg-offset-2">
                                    <button type="submit" name="acao" class="btn btn-warning" value="cadastrar_cli">Cadastrar</button>
                                </div>
                            </div>
                        </fieldset>
                    </form>        
                </div>      
            </div>                
        </div>
    </body>
</html>

