package com.jsp.SchoolManagment;

import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;
import javax.persistence.Query;

public class ViewStudent
{
   public static List getStudentList()
   {
	    EntityManagerFactory emf = Persistence.createEntityManagerFactory("pruthvi");
	    EntityManager em = emf.createEntityManager();
	    
	    Query q = em.createQuery("Select s from Student s");
	    List<Student> students =  q.getResultList();
	    
	    return students;
   }
}
