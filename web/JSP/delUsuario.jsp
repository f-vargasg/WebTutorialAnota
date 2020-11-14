<%-- 
    Document   : delUsuario
    Created on : Nov 14, 2020, 4:49:51 PM
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
        <h3>Confirmación de Borrado</h3>
        <s:hidden name="id" value="%{us.id}" />
        <table>
            <tbody>
                <tr>
                    <td> id:</td>
                    <td><s:property value="us.id"/></td>
                </tr>
                <tr>
                    <td>nombre:</td>
                    <td><s:property value="us.nombre"/></td>
                </tr>
                <tr>
                    <td>apellido:</td>
                    <td><s:property value="us.apellido"/> </td>
                </tr>
                <tr>
                    <td>correo:</td>
                    <td><s:property value="us.correo"/></td>
                </tr>
            </tbody>
        </table>

        <table >
            <tbody>
                <tr>
                    <td><s:form action="eliminarUsuario.action">
                            <s:hidden name="id" value="%{us.id}" />
                            <s:submit value="Eliminar"></s:submit>
                        </s:form></td>
                    <td><s:form action="consultar.action">
                            <s:submit value="Cancelar"></s:submit>
                        </s:form></td>
                </tr>
            </tbody>
        </table>


    </body>
</html>
