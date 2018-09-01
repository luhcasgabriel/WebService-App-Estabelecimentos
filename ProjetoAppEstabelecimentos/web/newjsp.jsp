<%-- 
    Document   : newjsp
    Created on : 30/08/2018, 21:14:09
    Author     : pc
--%>

<%@page import="App.Class.Model.Pedido_Produto"%>
<%@page import="App.Class.Controllers.PedidoController"%>
<%@page import="App.Class.Model.Pedido"%>
<%@page import="App.Class.Model.Usuario"%>
<%@page import="App.Class.Controllers.UsuarioController"%>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>JSP Page</title>
    </head>
    <body>
        <h1>Hello World!</h1>
        
        <% 
        PedidoController  us = new PedidoController();
        Usuario usuario = new Usuario();
        Pedido_Produto pedido = new Pedido_Produto();
        boolean kkk = us.inserirPedido(pedido,usuario);
        %>
        <div><%=kkk%></div>
        
        
        <% 
        
        Pedido_Produto produto = new Pedido_Produto();
        boolean novo = us.inserirPedidoNovoTabelaPedido_Produto(produto);
        
        %>
        <div><%=novo%></div>
    </body>
</html>
