package com.jsp.SchoolManagment;

import java.io.IOException;
import java.io.PrintWriter;
import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import javax.persistence.Persistence;
import javax.persistence.Query;
import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

@WebServlet("/updatetudent")
public class UpdateStudent extends HttpServlet
{
   @Override
protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException
{
	    int id = Integer.parseInt(req.getParameter("id"));
	    String name = req.getParameter("name");
		String stream = req.getParameter("stream");
		String fees = req.getParameter("fees");
		
	  
		
		
		
		EntityManagerFactory emf = Persistence.createEntityManagerFactory("pruthvi");
		EntityManager em = emf.createEntityManager();
		EntityTransaction et = em.getTransaction();
		
		Student s1 = em.find(Student.class, id);
	
		if(s1!=null)
		{
			Student s = new Student();
			s.setId(id);
			s.setName(name);
			s.setStream(stream);
			s.setFees(fees);
			
			et.begin();
			em.merge(s);
			et.commit();
			
			RequestDispatcher rd = req.getRequestDispatcher("updatestudentsucess.jsp");
			rd.forward(req, resp);
		}
		else
		{
			resp.setContentType("text/html");
			PrintWriter pw = resp.getWriter();
			pw.write("Invalid Student id!!!");
		}
		
		
			
		
		
		
	   
}
	
}
