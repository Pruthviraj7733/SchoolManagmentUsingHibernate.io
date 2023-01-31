package com.jsp.SchoolManagment;

import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;
import javax.persistence.Query;

public class ViewTeacher
{
	public static List getTeacherList()
	{
		    EntityManagerFactory emf = Persistence.createEntityManagerFactory("pruthvi");
		    EntityManager em = emf.createEntityManager();
		    
		    Query q = em.createQuery("Select t from Teacher t");
		    List<Teacher> teachers =  q.getResultList();
		    
		    return teachers;
	}
}
