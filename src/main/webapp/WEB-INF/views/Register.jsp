<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
    <%@taglib prefix="form" uri="http://www.springframework.org/tags/form" %>
    <%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
<h1>welcome to the registeration page</h1>
<form:form action="save" method="POST" modelAttribute="product">
<pre>
<c:if test="${'edit' == model}">
ID		:<form:input path="id" readonly="true"/>
</c:if>
ProductCode : <form:input path="pCode"/>
ProductName : <form:input path="pName"/>
ProductCost : <form:input path="pCost"/>
<c:choose>
<c:when test="${'edit' eq model}">
<input type="submit" value="UPDATE">
</c:when>
<c:otherwise>
<input type="submit" value="REGISTER PRODUCT">
</c:otherwise>
</c:choose>
</pre>
</form:form>
${message }<br>
<a href="get">TOTALRECORDS</a>
</body>
</html>