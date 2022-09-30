<%-- 
    Document   : viewnote
    Created on : 28-Sep-2022, 6:44:49 PM
    Author     : Justin
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<%@ taglib prefix = "c" uri = "http://java.sun.com/jsp/jstl/core" %>

<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>View note</title>
    </head>
    <body>
        <h1>Simple Note Keeper </h1>
        <h3>Title:</h3> <c:out value="${note.title}"/>
        <h3>Contents:</h3> <c:out value="${note.contents}"/>
        <br>
        <a href="note?edit">edit</a>
    </body>
</html>
