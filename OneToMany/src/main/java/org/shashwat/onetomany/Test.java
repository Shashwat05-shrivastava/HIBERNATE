package org.shashwat.onetomany;

import java.util.ArrayList;
import java.util.List;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.shashwat.onetomany.config.HibConfig;
import org.shashwat.onetomany.entities.Answers;
import org.shashwat.onetomany.entities.Question;

public class Test {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		SessionFactory factory=HibConfig.getSessionFactory();
		Session session=factory.openSession();
		Transaction tx=null;
		try {
			tx=session.beginTransaction();
			Question q= new Question();
			q.setqId(101);
			q.setQuestion("What is java?");
			
			Answers a=new Answers();
			a.setaId(201);
			a.setAnswers("It is a programming language");
			a.setQuestion(q);
			
			Answers a1=new Answers();
			a1.setaId(202);
			a1.setAnswers("It helps to build softwares");
			a1.setQuestion(q);
			
			List<Answers> l=new ArrayList<Answers>();
			l.add(a);
			l.add(a1);
			
			q.setAnswers(l);
			session.save(a);
			session.save(a1);
			session.save(q);
			
			tx.commit();
			
			//fetching details
			Question q1=(Question)session.get(Question.class, 101);
			System.out.println(q1.toString());
			for(Answers aa:q1.getAnswers()) {
				System.out.println(aa.getAnswers());
			}
			
		}catch(Exception e) {
			tx.rollback();
		}
		finally {
			session.close();
		}
	}

}
