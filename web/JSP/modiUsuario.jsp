<%-- 
    Document   : modiUsuario
    Created on : Nov 13, 2020, 11:13:15 PM
    Author     : garfi
--%>
<%@taglib uri="/struts-tags" prefix="s" %>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>JSP Page</title>
    </head>
    <body>
        <h2>Modificar</h2>
        <a href="consultar.action">Listado de Usuarios</a> <br/>
        <s:form action="modificarUsuario.action">
            <s:hidden name="id" value="%{us.id}" />
            <s:textfield label="Nombre" name="us.nombre"></s:textfield>
            <s:textfield label="Apellido" name="us.apellido"></s:textfield>
            <s:textfield label="Correo" name="us.correo"></s:textfield>
            <s:textfield label="Contraseña" name="us.pass"></s:textfield>
            <s:submit value="Modificar"></s:submit>
        </s:form>
        <s:form action="consultar.action">
            <s:submit value="Cancelar"></s:submit>
        </s:form>
    </body>
</html>
