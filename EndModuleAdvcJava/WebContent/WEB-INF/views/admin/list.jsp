<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body><h2>status :</h2>
<table>

<c:forEach var="v" items="${requestScope.cust_list}">
<tr>
<td>${v.name}</td>
<td>${v.city}</td>
<td>${v.age}</td>
<td>${v.cust_id}</td>
</tr>
</c:forEach>
</table>

</body>
</html>