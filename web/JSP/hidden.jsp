<%-- 
    Document   : hidden
    Created on : Nov 12, 2020, 10:28:21 PM
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
        <!--
            hidden.jsp => hiddenDemo.action (una variable que se llama pageId) setter
        se pasa a la accion
         hiddenDemo => resultTags.jsp
        -->
        <s:form action="hiddenDemo.action">
		<s:hidden name="pageId" value="holamundo" />
		<s:submit label="Submit" />
	</s:form>
    </body>
</html>
