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

    <hr/>
    <div style="text-align:center;">
      <form action="updateindb">
        <div class="mb-3">
          <label for="id" class="form-label">StudentRollNumber :</label>
          <input type="text" name="studentRollNumber">
        </div>  
          <div class="mb-3">
            <label for="name" class="form-label">Student First Name :</label>
            <input type="text" name="studentFirstName">
          </div>
          <div class="mb-3">
              <label for="name" class="form-label">Student last Name :</label>
              <input type="text" name="studentLastName">
            </div>
          <div class="mb-3">
              <label for="address" class="form-label">Gender:</label>
              <input type="text" name="studentGender">
            </div>
            <div class="mb-3">
              <label for="age" class="form-label">studentAddress :</label>
              <input type="text" name="studentAddress">
            </div>
            <div class="mb-3">
              <label for="phone" class="form-label">studentCourse :</label>
              <input type="text" name="studentCourse">
            </div>
         
          <button type="submit" class="btn btn-primary">Update Student</button>
        </form>
  </div>

    <script src="https://cdn.jsdelivr.net/npm/bootstrap@5.3.0-alpha1/dist/js/bootstrap.bundle.min.js"
        integrity="sha384-w76AqPfDkMBDXo30jS1Sgez6pr3x5MlQ1ZAGC+nuZB+EYdgRZgiwxhTBTkF7CXvN"
        crossorigin="anonymous"></script>
</body>

</html>