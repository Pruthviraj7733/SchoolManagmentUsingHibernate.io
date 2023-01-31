<%@page import="com.jsp.SchoolManagment.Student"%>
<%@page import="java.util.List"%>
<%@page import="com.jsp.SchoolManagment.ViewStudent"%>
<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Display All Students Detail</title>
</head>
<body>
<%

List<Student>students =  ViewStudent.getStudentList();

%>
<center>
<h2>All Students In Qspider</h2><br>
<table border="5" width="300" height="70" style="text-align: center;">
<tr>
<th>id</th>
<th>Name</th>
<th>Stream</th>
<th>Fees</th>
</tr>

<%for(Student s : students){ %>
<tr>
<td><%= s.getId() %> </td>
<td><%= s.getName() %></td>
<td><%= s.getStream() %></td>
<td><%= s.getFees() %></td>
</tr>
<%} %>
</table>
<br><br>
<button><a href="student.jsp" style="text-decoration: none;">Back</a></button>
</center>


</body>
</html>