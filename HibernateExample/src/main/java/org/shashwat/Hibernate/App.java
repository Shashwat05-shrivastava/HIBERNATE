package org.shashwat.Hibernate;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;
import org.shashwat.Hibernate.entities.Student;

public class App {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("Project started");
		
		SessionFactory factory=new Configuration().configure().buildSessionFactory();
		
		Student st= new Student();
		st.setId(1);
		st.setName("Shashwat");
		st.setCity("Patna");
		
		Session session=factory.openSession();
		session.beginTransaction();
		session.save(st);
		session.getTransaction().commit();
		session.close();
	}

}
