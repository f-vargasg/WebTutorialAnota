<%-- 
    Document   : resullttags
    Created on : Nov 12, 2020, 10:33:07 PM
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
        <h2>JavaBeat - Struts 2 Hidden Tag Demo</h2>
        <h4>
            Page Id :	<s:property value="pageId" /><br>
            <s:form action="%{pageId}.action">
                <s:hidden name="codTipoGastoN" value="%{moneda.codMonedaN}" />
                <s:textfield label="Codigo" name="moneda.codMonedaN" disabled="false" ></s:textfield>    
                <s:textfield label="Descripcion" name="moneda.desMoneda"></s:textfield>
                <s:submit value="Registrar"></s:submit>
            </s:form>
        </h4>
    </body>
</html>
