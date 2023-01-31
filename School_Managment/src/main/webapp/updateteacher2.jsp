<%@page import="com.jsp.SchoolManagment.Teacher"%>
<%@page import="javax.persistence.EntityManager"%>
<%@page import="javax.persistence.Persistence"%>
<%@page import="javax.persistence.EntityManagerFactory"%>
<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>


<%
    int id = Integer.parseInt(request.getParameter("id"));
    
    EntityManagerFactory emf = Persistence.createEntityManagerFactory("pruthvi");
    EntityManager em = emf.createEntityManager();
    
    Teacher t = em.find(Teacher.class, id);
    if(t!=null)
    {
    	%>
    	<!DOCTYPE html>
		<html>
		<head>
		<meta charset="ISO-8859-1">
		<title>Update Teacher Information</title>
		</head>
		<body style="text-align: center;">
		<h2>Update Teacher</h2>
		<form action="updateteacher" method="post">
		Teacher id : <input type="text" name="id" value="<%= t.getId()%>"><br><br>
		Teacher Name : <input type="text" name="name" value="<%= t.getName()%>"><br><br>
		Teacher Subject : <input type="text" name="subject" value="<%= t.getSubject()%>"><br><br>
		Teacher Salary : <input type="text" name="salary" value="<%= t.getSalary()%>"><br><br>
		<input type="submit" value="Submit" style="cursor: pointer;">
		</form>
		
		</body>
		</html>
		
		<%
    	
    }
    else
    {
    	out.print("Teacher Not Found!!!");
    }
    
%>
