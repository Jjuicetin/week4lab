<%-- 
    Document   : editnote
    Created on : 28-Sep-2022, 6:45:01 PM
    Author     : puppi
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<%@ taglib prefix = "c" uri = "http://java.sun.com/jsp/jstl/core" %>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>Edit no</title>
    </head>
    <body>
        <h1>Edit Note</h1>
        <form action="note" method="post">
            Title: <input type="text" name="title" id="title"><br>
            Contents: <input type="text" name="contents" id="contents"><br>
            
            <button type="submit">Submit</button>
        </form>
        
    </body>
</html>
