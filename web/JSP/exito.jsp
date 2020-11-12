<%-- 
    Document   : Exito
    Created on : Sep 26, 2020, 9:30:34 PM
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
        <h1>Consultar</h1>
        <s:form action="/JSP/consultar.action">
            <s:submit value="Consultar"></s:submit>
        </s:form>
    </body>
</html>
