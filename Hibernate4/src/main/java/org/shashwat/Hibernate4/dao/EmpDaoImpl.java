package org.shashwat.Hibernate4.dao;

import java.text.SimpleDateFormat;
import java.util.List;
import java.util.Optional;

import org.hibernate.Query;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.shashwat.Hibernate4.config.HibConfig;
import org.shashwat.Hibernate4.entities.Emp;

public class EmpDaoImpl implements EmpDao{
	private SessionFactory factory=HibConfig.getSessionFactory();
	@Override
	public void insert(Emp e) {
		// TODO Auto-generated method stub
		Session session=factory.openSession();
		Transaction tx=null;
		try {
			tx=session.beginTransaction();
			session.save(e);
			tx.commit();
		}catch(Exception e1) {
			tx.rollback();
		}
		finally {
			session.close();
		}
	}

	@Override
	public List<Emp> getAll() {
		// TODO Auto-generated method stub
		Session session=factory.openSession();
		Query<Emp>query=session.createQuery("select e from org.virtusa.Hibernate4.entities.Emp e");
		return query.list();
		
	}

	@Override
	public void delete(int eno) {
		// TODO Auto-generated method stub
		Session session=factory.openSession();
		Transaction tx=null;
		try {
			tx=session.beginTransaction();
			Query<Emp>query=session.createQuery("delete from org.virtusa.Hibernate4.entities.Emp e where e.eno=?1");
			query.setInteger(1, eno);
			query.executeUpdate();
			tx.commit();
		}catch(Exception e1) {
			tx.rollback();
		}
		finally {
			session.close();
		}
		
	}

	@Override
	public Optional<Emp> get(int eno) {
		Session session=factory.openSession();
		Query<Emp>query=session.createQuery("select e from org.virtusa.Hibernate4.entities.Emp e where e.eno=?1");
		query.setInteger(1, eno);
		return Optional.ofNullable(query.uniqueResult());
	}

	@Override
	public void update(int eno, Emp e) {
		// TODO Auto-generated method stub
		Session session=factory.openSession();
		Transaction tx=null;
		try {
			tx=session.beginTransaction();
			Query<Emp>query=session.createQuery("update from org.virtusa.Hibernate4.entities.Emp e set e.name=?1,e.address=?2 where e.eno=?3");
			query.setString(1, e.getName());
			query.setString(2, e.getAddress());
			query.setInteger(3, eno);
			query.executeUpdate();
			tx.commit();
		}catch(Exception e1) {
			tx.rollback();
		}
		finally {
			session.close();
		}
	}

}
