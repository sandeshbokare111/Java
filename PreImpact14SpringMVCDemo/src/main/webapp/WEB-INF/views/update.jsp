<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Add Product</title>
<style>
#container{
height: 400px;
width: 400px;
border: 1px solid blue;
margin-left: 460px;
text-align: center;
}
form{
margin: 50px;
font-family: cursive;
}

</style>
</head>
<body>
<h1 style="text-align: center; color: blue;">Update Product</h1>
<div id="container">

<form action="updateSuccess">
Product ID: <input type="text" name="pid" />
<br>
<br/>
<br/>
Product Name: <input type="text" name="pname" />
<br>
<br/>
<br/>
Product Price: <input type="text" name="pprice" />
<br>
<br/>
<br/>
<input style="background-color: blue; padding: 15px; color: white;" type="submit"  value="Update Product"/>

</form>

</div>
</body>
</html>