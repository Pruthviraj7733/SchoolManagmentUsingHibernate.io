<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Add Teacher Information</title>
</head>
<body style="text-align: center;">
<h2>Teacher Details</h2>
<form action="teacherdetails" method="post">
<input type="text" name="id" placeholder="Enter Teacher id"><br><br>
<input type="text" name="name" placeholder="Enter Teacher Name"><br><br>
<input type="text" name="subject" placeholder="Enter Teacher Subject"><br><br>
<input type="text" name="salary" placeholder="Enter Teacher Salary"><br><br>
<input type="submit" value="Submit" style="cursor: pointer;">
</form>

</body>
</html>