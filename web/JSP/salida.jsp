<%-- 
    Document   : Salida
    Created on : Sep 26, 2020, 4:23:05 PM
    Author     : garfi
--%>

<%@taglib uri="/struts-tags" prefix="s" %>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>JSP Page</title>
        <script>var base = "${pageContext.request.contextPath}";</script>
    </head>
    <body>
        <h1>Registro Insertado</h1>
        <s:property value="us.nombre"></s:property><br>
        <s:property value="us.apellido"></s:property><br>
        <s:property value="us.correo"></s:property><br>
        <s:property value="us.contrasena"></s:property><br>
        <br>
        <br><br>
        
        <a href="${pageContext.request.contextPath}/JSP/Principal.jsp">Volver a incluir</a>
        
        
    </body>
</html>
