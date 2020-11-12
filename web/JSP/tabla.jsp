<%-- 
    Document   : Tabla
    Created on : Sep 26, 2020, 6:47:08 PM
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
        <h1>Hello World!</h1>
        <table>
            <tr>
                <td>Id</td>
                <td>Nombre</td>
                <td>Apellido</td> 
                <td>Email</td>
                <td>Contraseña</td>
            </tr>
            <s:iterator value="lista">
                <tr>
                    <td><s:property value="id"></s:property></td>
                    <td><s:property value="nombre"></s:property></td>
                    <td><s:property value="apellido"></s:property></td>
                    <td><s:property value="correo"></s:property></td>
                    <td><s:property value="pass"></s:property></td>
                    <td><s:property value="fecIngreso"></s:property></td>
                    </tr>
            </s:iterator>     
        </table>

    </body>
</html>
