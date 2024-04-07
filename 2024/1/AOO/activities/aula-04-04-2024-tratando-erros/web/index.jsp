<%@page contentType="text/html" pageEncoding="UTF-8"%>

<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>Teste de dados</title>
    </head>
    <body>
        <h1>Cadastro de itens com tratamento de erros!</h1>
        <div id="frm">
            <<form action="ExTrataErrosJSP_Dados.jsp" name="frmItens" method="post">
                <pre>
                    --- INCLUSÃO DE ITENS ---
                    =========================
                    
                    Código:             <input type="text" name="codigo" size="8">
                    Descrição:          <input type="text" name="descricao" size="40">
                    Unidade:            <input type="text" name="unidade" size="10">
                    Saldo:              <input type="text" name="saldo" size="10">
                    Valor unitário:     <input type="text" name="valorUnitario" size="40">
                    Observações:        <input type="text" name="obs" size="40">

                    <input type="submit" value="Incluir" name="acao">
                    <input type="reset" value="Limpar" name="limpar">
                </pre>
            </form>
        </div>
    </body>
</html>
