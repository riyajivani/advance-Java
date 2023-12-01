<%@page contentType="text/html" pageEncoding="UTF-8"%>
<%@taglib uri="/WEB-INF/tlds/MyTLD" prefix="t" %>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>JSP Page</title>
    </head>
    <body>
        <h1>Hello World!</h1>
        <t:mytag></t:mytag>
        <hr>
        <t:PrintTable number="100" color="blue"></t:PrintTable>
        <t:PrintTable number="10" color="pink"></t:PrintTable>
    </body>
</html>
