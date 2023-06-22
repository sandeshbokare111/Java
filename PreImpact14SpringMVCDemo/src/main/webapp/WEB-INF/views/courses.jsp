<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<%@page isELIgnored="false" %>
<%@ taglib prefix = "c" uri = "http://java.sun.com/jsp/jstl/core" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Courses</title>
</head>
<body>
<h1 style="text-align: center; color: blue;">We Offers </h1>
<h2>Department Name: ${dept}</h2>
<hr>
<h2>We Offer ${crs}</h2>

<c:forEach var="item" items="${crs}">
	<h3>${item}</h3>
</c:forEach>
</body>
</html>