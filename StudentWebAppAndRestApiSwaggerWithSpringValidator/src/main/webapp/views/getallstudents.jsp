<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<%@page isELIgnored="false"%>
<!doctype html>
<html lang="en">

<head>
    <meta charset="utf-8">
    <meta name="viewport" content="width=device-width, initial-scale=1">
    <title>Bootstrap demo</title>
    <link href="https://cdn.jsdelivr.net/npm/bootstrap@5.3.0-alpha1/dist/css/bootstrap.min.css" rel="stylesheet"
        integrity="sha384-GLhlTQ8iRABdZLl6O3oVMWSktQOp6b7In1Zl3/Jr59b6EGGoI1aFkw7cmDA6j6gD" crossorigin="anonymous">
</head>

<body>
    <h1 style="text-align: center; color: tomato;">Welcome to Student Management System</h1>
    <hr />
    <h2 style="text-align: center; color: rgb(58, 148, 204);">Select Operation</h2>
    <hr />
    <div style="text-align: center;">
        <button type="button" class="btn btn-primary"><a href="addstudent" style="color: white; text-decoration: none;">Add Student</a></button>
        <button type="button" class="btn btn-secondary"><a href="updatestudent" style="color: white; text-decoration: none;">Update Student</a></button>
        <button type="button" class="btn btn-success"><a href="deletestudent" style="color: white; text-decoration: none;">Delete Student</a></button>
        <button type="button" class="btn btn-danger"><a href="getstudents" style="color: white; text-decoration: none;">Get All Student</a></button>
        <button type="button" class="btn btn-warning"><a href="getstudent" style="color: white; text-decoration: none;">Get Student By ID</a></button>
    </div>
    <hr/>
    <h2 style="text-align: center; color: rgb(58, 148, 204);">List of Students</h2>
    <h2>${students}</h2>
    <script src="https://cdn.jsdelivr.net/npm/bootstrap@5.3.0-alpha1/dist/js/bootstrap.bundle.min.js"
        integrity="sha384-w76AqPfDkMBDXo30jS1Sgez6pr3x5MlQ1ZAGC+nuZB+EYdgRZgiwxhTBTkF7CXvN"
        crossorigin="anonymous"></script>
</body>

</html>