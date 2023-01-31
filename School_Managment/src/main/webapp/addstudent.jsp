<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Add Student Information</title>
</head>
<body style="text-align: center;">
<h2>Student Details</h2>
<form action="studentdetails" method="post">
<input type="text" name="id" placeholder="Enter Student id"><br><br>
<input type="text" name="name" placeholder="Enter Student Name"><br><br>
<input type="text" name="stream" placeholder="Enter Student Stream"><br><br>
<input type="text" name="fees" placeholder="Enter Student Fees"><br><br>
<input type="submit" value="Submit">
</form>
</body>
</html>