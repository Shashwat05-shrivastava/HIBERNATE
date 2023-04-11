package org.shashwat.OnetoOne;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.shashwat.OnetoOne.config.HibConfig;
import org.shashwat.OnetoOne.entities.Passport;
import org.shashwat.OnetoOne.entities.Student;

public class Test {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		SessionFactory factory=HibConfig.getSessionFactory();
		Session session=factory.openSession();
		Transaction tx=null;
		try {
			tx=session.beginTransaction();
			Student s=new Student();
			s.setSid(102);
			s.setName("shashwatkumar");
			s.setAddress("Patnaara");
			
			Passport p=new Passport();
			p.setPid(203);
			p.setPno("12345567");
			p.setStudent(s);
			
			s.setPassport(p);
			
			session.save(s);
			session.save(p);
			tx.commit();
			
			//getting the details
			Passport p1= (Passport) session.get(Passport.class,203);
			System.out.println(p1.getPno());
			System.out.println(p1.getStudent().getName());
			
		}catch(Exception e) {
			tx.rollback();
		}
		finally {
			session.close();
		}
	}

}
