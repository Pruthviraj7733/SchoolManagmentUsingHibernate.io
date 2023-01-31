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

@WebServlet("/removestudent")
public class RemoveStudent extends HttpServlet
{
    @Override
    protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
    	
    	int id = Integer.parseInt(req.getParameter("id"));
    	
    	EntityManagerFactory emf = Persistence.createEntityManagerFactory("pruthvi");
    	EntityManager em = emf.createEntityManager();
    	EntityTransaction et = em.getTransaction();
    	
    	Student s = em.find(Student.class, id);
    	
    	if(s!=null)
    	{
    		et.begin();
    		em.remove(s);
    		et.commit();
    		
    		RequestDispatcher rd = req.getRequestDispatcher("removesucess.jsp");
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
