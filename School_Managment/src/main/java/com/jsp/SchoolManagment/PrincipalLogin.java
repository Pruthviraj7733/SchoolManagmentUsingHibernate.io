package com.jsp.SchoolManagment;

import java.io.IOException;
import java.io.PrintWriter;
import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;
import javax.persistence.Query;
import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet("/plogin")
public class PrincipalLogin extends HttpServlet
{
	@Override
	protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		
		String email = req.getParameter("email");
		String password = req.getParameter("password");
		
		EntityManagerFactory emf = Persistence.createEntityManagerFactory("pruthvi");
		EntityManager em = emf.createEntityManager();
		
		Query q = em.createQuery("select p from Principal p where p.email=?1 and p.password=?2");
		
		q.setParameter(1, email);
		q.setParameter(2, password);
		
		List<Principal> principals = q.getResultList();
		
		if(principals.size()>0)
		{
			for(Principal p : principals)
			{
				System.out.println("Welcome "+p.getName());
				RequestDispatcher rd = req.getRequestDispatcher("sucess.jsp");
				rd.forward(req, resp);
			
			}
		}
		else
		{
			resp.setContentType("text/html");
			PrintWriter pw = resp.getWriter();
			pw.write("Invalid Email or password!!!");;
		}
	}

}
