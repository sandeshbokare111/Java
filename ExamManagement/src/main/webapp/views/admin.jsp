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
    <h1 style="text-align: center; color: tomato;">Welcome to Exam Management System</h1>
    <hr />
    <h2 style="text-align: center; color: rgb(58, 148, 204);">Select Operation</h2>
    <hr />
    <div style="text-align: center;">
        <button type="button" class="btn btn-primary"><a href="addstudent" style="color: rgb(230, 230, 223); text-decoration: none;">Add Student</a></button>
        <button type="button" class="btn btn-secondary"><a href="updatestudent" style="color: rgb(190, 192, 207); text-decoration: none;">Update Student</a></button>
        <button type="button" class="btn btn-success"><a href="deletestudent" style="color: rgb(181, 170, 170); text-decoration: none;">Delete Student</a></button>
        <button type="button" class="btn btn-danger"><a href="getstudents" style="color: rgb(191, 181, 181); text-decoration: none;">Get All Student</a></button>
        <button type="button" class="btn btn-warning"><a href="getstudent" style="color: rgb(175, 177, 174); text-decoration: none;">Get Student By ID</a></button>
        <button type="button" class="btn btn-primary"><a href="getstudentbyname" style="color: rgb(203, 219, 201); text-decoration: none;">Get Student By Name</a></button>

        <button type="button" class="btn btn-primary"><a href="addquestion" style="color: rgb(140, 152, 139); text-decoration: none;">Add Question</a></button>
        <button type="button" class="btn btn-secondary"><a href="updatequestion" style="color: rgb(240, 240, 243); text-decoration: none;">Update Question</a></button>
        <button type="button" class="btn btn-success"><a href="deletequestion" style="color: rgb(214, 221, 223); text-decoration: none;">Delete Question</a></button>
        <button type="button" class="btn btn-danger"><a href="getallquestions" style="color: rgb(234, 239, 240); text-decoration: none;">Get All Question</a></button>
        
    </div>
    
    <script src="https://cdn.jsdelivr.net/npm/bootstrap@5.3.0-alpha1/dist/js/bootstrap.bundle.min.js"
        integrity="sha384-w76AqPfDkMBDXo30jS1Sgez6pr3x5MlQ1ZAGC+nuZB+EYdgRZgiwxhTBTkF7CXvN"
        crossorigin="anonymous"></script>
</body>

</html>