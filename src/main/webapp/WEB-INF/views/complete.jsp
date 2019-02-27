<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Complete</title>
</head>
<body>
<%@include file="partials/header.jsp" %>
<table>
    
        <tr>
        <th>First Name</th><th>Last Name</th><th>Innovation</th><th>Year</th>
        </tr>
    <c:forEach var="Complete" items="${ Complete }">
    
    
    <tr>
        <td>${ Complete.firstName }</td>
        <td>${ Complete.lastName }</td>
        <td>${ Complete.innovation }</td>
        <td>${ Complete.year }</td>
    </tr>

    
    </c:forEach>
    </table>
    
    
</body>
</html>