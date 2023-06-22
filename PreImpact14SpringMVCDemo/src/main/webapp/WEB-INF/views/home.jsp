<%@page import="java.util.List"%>
<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Home Page</title>
</head>
<body>
<h1 style="text-align: center; color: blue;">Welcome to My Shopping Application</h1>
<%
	String name= (String)request.getAttribute("student");
	String id = (String)request.getAttribute("id");
	List<String> cities = (List<String>)request.getAttribute("cities");
	
%>
<h2>Welcome <%=name %></h2>
<h2>Your ID is <%=id %></h2>
<h2><% 
for(String city:cities){
	out.println(city);
}
%>
</h2>
</body>
</html>