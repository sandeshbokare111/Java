<!doctype html>
<html lang="en">

<head>
    <meta charset="utf-8">
    <meta name="viewport" content="width=device-width, initial-scale=1">
    <title>AdminMenu</title>
    <link href="https://cdn.jsdelivr.net/npm/bootstrap@5.3.0-alpha1/dist/css/bootstrap.min.css" rel="stylesheet"
        integrity="sha384-GLhlTQ8iRABdZLl6O3oVMWSktQOp6b7In1Zl3/Jr59b6EGGoI1aFkw7cmDA6j6gD" crossorigin="anonymous">
</head>

<body>
    <h1 style="text-align: center; color: tomato;">Welcome to Student Management System</h1>
    <hr />
    <h2 style="text-align: center; color: rgb(58, 148, 204);">Add Question</h2>
  <hr/>
    <div style="text-align:center;">
        <form action="addedindbs">
            <div class="mb-3">
              <label for="name" class="form-label">Enter the Question :</label>
              <input type="text" name="question">
            </div>
            <div class="mb-3">
                <label for="name" class="form-label">Option 1  :</label>
                <input type="text" name="opt1">
              </div>
            <div class="mb-3">
                <label for="address" class="form-label">Option 2 :</label>
                <input type="text" name="opt2">
              </div>
              <div class="mb-3">
                <label for="age" class="form-label">Option 3  :</label>
                <input type="text" name="opt3">
              </div>
              <div class="mb-3">
                <label for="phone" class="form-label">correct answer :</label>
                <input type="text" name="correct_ans">
              </div>
           
            <button type="submit" class="btn btn-primary">Add Question</button>
          </form>
    </div>
    <script src="https://cdn.jsdelivr.net/npm/bootstrap@5.3.0-alpha1/dist/js/bootstrap.bundle.min.js"
        integrity="sha384-w76AqPfDkMBDXo30jS1Sgez6pr3x5MlQ1ZAGC+nuZB+EYdgRZgiwxhTBTkF7CXvN"
        crossorigin="anonymous"></script>
</body>

</html>