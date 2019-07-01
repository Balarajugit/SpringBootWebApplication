<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
    <%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
<h1>Total recordes are</h1>
<table border="10px">
<tr>
<th>PRODUCTID</th>
<th>PRODUCTCODE</th>
<th>PRODUCTNAME</th>
<th>PRODUCTCOST</th>
<th>OPERATIONS</th>
</tr>
<c:forEach items="${list}" var="op">
<tr>
<td><c:out value="${op.id }"></c:out></td>
<td><c:out value="${op.pCode }"></c:out></td>
<td><c:out value="${op.pName }"></c:out></td>
<td><c:out value="${op.pCost }"></c:out></td>
<td><a href="delete?id=${op.id }">DELETE || </a>
<a href="edit?id=${op.id }">EDIT</a>
</tr>
</c:forEach>
</table>
</body>
</html>