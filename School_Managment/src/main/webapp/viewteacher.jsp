<%@page import="com.jsp.SchoolManagment.Teacher"%>
<%@page import="com.jsp.SchoolManagment.ViewTeacher"%>
<%@page import="java.util.List"%>
<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Display All Teachers Detail</title>
</head>
<body>
<% 

List<Teacher> teachers = ViewTeacher.getTeacherList();


%>
<center>
<h2>All Teachers In Qspider</h2><br>
<table border="5" width="300" height="70" style="text-align: center;">
<tr>
<th>id</th>
<th>Name</th>
<th>Subject</th>
<th>Salary</th>
</tr>

<%for(Teacher t : teachers){ %>
<tr>
<td><%= t.getId() %> </td>
<td><%= t.getName() %></td>
<td><%= t.getSubject() %></td>
<td><%= t.getSalary() %></td>
</tr>
<%} %>
</table>
<br><br>
<button><a href="teacher.jsp" style="text-decoration: none;">Back</a></button>
</center>

</body>
</html>