<%
    String usuario = (String) session.getAttribute("usuario");
    if (usuario == null) {
        String msg = (String) application.getAttribute("mensagem");
        msg = (msg == null) ? "Antentique-se para acesso completo!" : msg;
%>
<div class="panel"  >
    <form action="loginres.jsp" method="post" >
        <input type="text" name="usuario" size="10" placeholder="Usuário" >
        <input type="password" name="senha" size="10" placeholder="Senha" >
        <input type="submit" name="acao" Value="Login" >
        <div style="text-align: center" ><%=msg%></div>
    </form>
</div>
<%
} else {
%>
<div class="panel" >
    <form action="loginres.jsp" method="post" >
        <div>
            Usuário:
            <input type="text" name="usuario" size="10" 
                   value="<%=usuario%>" disabled >
            <input type="submit" name="acao" Value="Logoff" >
        </div>
        <div style="text-align: center" >Acesso total !</div>
    </form>
</div>
<%}%>