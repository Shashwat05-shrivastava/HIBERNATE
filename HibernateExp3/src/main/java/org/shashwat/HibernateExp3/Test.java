package org.shashwat.HibernateExp3;

import java.time.LocalDate;

import org.shashwat.HibernateExp3.dao.EmpDao;
import org.shashwat.HibernateExp3.dao.EmpDaoImpl;
import org.shashwat.HibernateExp3.entities.Emp;

public class Test {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Emp e=new Emp();
		EmpDao dao=new EmpDaoImpl();
		//dao.getAll().forEach(emp->System.out.println(emp.getEno()+"\t"+emp.getName()+"\t"+emp.getAddress()+"\t"+emp.getDateOfJoin()));
		e.setEno(101);
		e.setName("shrivastava");
		e.setAddress("Ara");
		e.setDateOfJoin(LocalDate.now());
		dao.insert(e);
	}

}
