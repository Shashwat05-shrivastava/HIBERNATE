package org.shashwat.HibernateExp3.dao;

import java.util.List;
import java.util.Optional;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.query.Query;
import org.shashwat.HibernateExp3.config.HibConfig;
import org.shashwat.HibernateExp3.entities.Emp;

public class EmpDaoImpl implements EmpDao{
	SessionFactory factory;
	
	public EmpDaoImpl() {
		factory=HibConfig.getSessionFactory();
	}

	@Override
	public void insert(Emp e) {
		Transaction tx=null;
		Session session=factory.openSession();
		try {
			tx=session.beginTransaction();
			session.save(e);
			tx.commit();
			
		}catch(Exception e1) {
			tx.rollback();
		}
		session.close();
	}

	@Override
	public List<Emp> getAll() {
		// TODO Auto-generated method stub
		Session session=factory.openSession();
		Transaction tx=null;
		List<Emp>employees=null;
		try {
			tx=session.beginTransaction();
			Query<Emp>query=session.createQuery("select e from org.virtusa.HibernateExp3.entities.Emp e");
			employees=query.list();
			
		}catch(Exception e1) {
			tx.rollback();
		}
		session.close();
		return employees;
	}

	@Override
	public void delete(int eno) {
		// TODO Auto-generated method stub
		Transaction tx=null;
		Session session=factory.openSession();
		try {
			tx=session.beginTransaction();
			Emp e=session.get(Emp.class,eno);
			session.delete(e);
			tx.commit();
			
		}catch(Exception e1) {
			tx.rollback();
		}
		session.close();
	}

	@Override
	public Optional<Emp> get(int eno) {
		// TODO Auto-generated method stub
		Session session=factory.openSession();
		Emp e=session.get(Emp.class, eno);
		session.close();
		return Optional.ofNullable(e);
	}

	@Override
	public void update(int eno, Emp e) {
		// TODO Auto-generated method stub
		Transaction tx=null;
		Session session=factory.openSession();
		try {
			tx=session.beginTransaction();
			Emp e1=session.get(Emp.class,eno);
			e1.setEno(e.getEno());
			e1.setName(e.getName());
			e1.setAddress(e.getAddress());
			e1.setDateOfJoin(e.getDateOfJoin());
			tx.commit();
			session.close();
			
		}catch(Exception e1) {
			tx.rollback();
		}
	}

}
