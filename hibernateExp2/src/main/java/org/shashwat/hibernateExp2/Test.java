package org.shashwat.hibernateExp2;

import java.time.LocalDate;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;
import org.shashwat.hibernateExp2.entities.Emp;

public class Test {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
        System.out.println("Project started");
		
		SessionFactory factory=new Configuration().configure().buildSessionFactory();
		
		Emp e=new Emp();
		e.setEno(1);
		e.setName("shrivastava");
		e.setAddress("Patna");
		e.setDateOfJoin(LocalDate.now());
		
		Session session=factory.openSession();
		session.beginTransaction();
		session.save(e);
		session.getTransaction().commit();
		session.close();
	}

}
