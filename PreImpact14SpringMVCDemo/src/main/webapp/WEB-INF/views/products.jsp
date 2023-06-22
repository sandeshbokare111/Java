<%@page import="com.model.Product"%>
<%@page import="java.util.List"%>
<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Products</title>
<style>
#container{
height: 400px;
width: 400px;
border: 1px solid blue;
margin-left: 460px;
text-align: center;
}
</style>
</head>
<body>
<div id="container">
<h1 style="text-align: center; color: blue;">Products Available</h1>
<% List<Product> products = (List<Product>)request.getAttribute("products");%>
<h3><%for(Product prod :products){
	out.println(prod.getPid()+"--"+prod.getPname()+"--"+prod.getPprice()+"<br/>");
	out.println("<hr>");}%></h3>
</div>
</body>
</html>