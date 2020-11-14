<%-- 
    Document   : Principal
    Created on : Sep 26, 2020, 12:57:15 PM
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
    <h3>Insertar Usuario</h3>
    <s:form action="registrar.action">
        <s:textfield label="Nombre" name="us.nombre"></s:textfield>
        <s:textfield label="Apellido" name="us.apellido"></s:textfield>
        <s:textfield label="Correo" name="us.correo"></s:textfield>
        <s:textfield label="Contraseña" name="us.pass"></s:textfield>
        <s:submit value="Registrar"></s:submit>
    </s:form>
    <s:form action="consultar.action">
        <s:submit value="Cancelar"></s:submit>
    </s:form>



</html>
