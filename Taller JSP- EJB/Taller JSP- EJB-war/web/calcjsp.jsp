<%-- 
    Document   : calcjsp
    Created on : 14/04/2023, 05:52:52 PM
    Author     : David Reinoso
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>JSP Page</title>
    </head>
    <body>
        <form action="calcservlet" method="POST">
            <input type="text" name="t1">
            <input type="text" name="t2">
            <br>
            <br>
            <input type="submit" name="action" value="suma">
            <input type="submit" name="action" value="resta">
            <input type="submit" name="action" value="multiplicacion">
            <input type="submit" name="action" value="division">
            <input type="submit" name="action" value="modulo">
            <input type="submit" name="action" value="potencia">
        </form>    
    </body>
</html>
