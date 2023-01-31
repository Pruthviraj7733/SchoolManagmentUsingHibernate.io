<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>

<h2>Principal Registration</h2>
<form action="principalregistration" method="post">
<input type="text" placeholder="Enter  Name" required="required" name="name"><br><br>
<input type="text" placeholder="Enter  Age" required="required" name="age"><br><br>
<input type="text" placeholder="Enter  Mno" required="required" name="mno"><br><br>
<input type="email" placeholder="Enter  Email-id" required="required" name="email"><br><br>
<input type="text" placeholder="Enter new Password" required="required" name="password"><br><br>
<input type="submit" value="Register">

<button><a href="index.jsp" style="text-decoration: none;">Back</a></button>

</form>
</body>
</html>