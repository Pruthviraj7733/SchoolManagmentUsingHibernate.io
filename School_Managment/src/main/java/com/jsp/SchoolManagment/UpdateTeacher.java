package com.jsp.SchoolManagment;

import java.io.IOException;

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

@WebServlet("/updateteacher")
public class UpdateTeacher extends HttpServlet
{
	@Override
	protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException
	{
		int id = Integer.parseInt(req.getParameter("id"));
		String name = req.getParameter("name");
		String subject = req.getParameter("subject");
		double salary = Double.parseDouble(req.getParameter("salary"));
		
		Teacher t = new Teacher();
		t.setId(id);
		t.setName(name);
		t.setSubject(subject);
		t.setSalary(salary);
		
		EntityManagerFactory emf = Persistence.createEntityManagerFactory("pruthvi");
		EntityManager em = emf.createEntityManager();
		EntityTransaction et = em.getTransaction();
		
		et.begin();
		em.merge(t);
		et.commit();
		
		RequestDispatcher rd = req.getRequestDispatcher("teacherupdatesucess.jsp");
		rd.forward(req, resp);
	}

}
