<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Tiny</title>
</head>
<body>
<%@include file="partials/header.jsp" %>
<table>
    
        <tr>
        <th>Name</th><th>Invented</th><th>Year</th>
        </tr>
    <c:forEach var="Tiny" items="${ Tiny }">
    
    
    <tr>
        <td>${ Tiny.name }</td>
        <td>${ Tiny.invented }</td>
        <td>${ Tiny.year }</td>
    </tr>

    
    </c:forEach>
    </table>
</body>
</html>