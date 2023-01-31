package com.jsp.SchoolManagment;

import java.io.IOException;
import java.io.PrintWriter;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import javax.persistence.Persistence;
import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet("/principalregistration")
public class PrincipalRegistration extends HttpServlet
{
	@Override
	protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException
	{
		 String name = req.getParameter("name");
		 int age = Integer.parseInt(req.getParameter("age"));
		 String mno = req.getParameter("mno");
		 String email = req.getParameter("email");
		 String password = req.getParameter("password");
		 
		 
		 EntityManagerFactory emf = Persistence.createEntityManagerFactory("pruthvi");
		 EntityManager em = emf.createEntityManager();
		 EntityTransaction et = em.getTransaction();
		 
		 Principal p1 = new Principal();
		 p1.setName(name);
		 p1.setAge(age);
		 p1.setMno(mno);
		 p1.setEmail(email);
		 p1.setPassword(password);
		 
		 et.begin();
		 em.persist(p1);
		 et.commit();
		 
	     RequestDispatcher rd = req.getRequestDispatcher("login.jsp");
	     rd.forward(req, resp);
		
		 
	} 

}
