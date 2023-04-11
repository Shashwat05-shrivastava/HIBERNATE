package org.shashwat.Hibernate4;

import java.time.LocalDate;

import org.shashwat.Hibernate4.dao.EmpDao;
import org.shashwat.Hibernate4.dao.EmpDaoImpl;
import org.shashwat.Hibernate4.entities.Emp;

public class Test {

	public static void main(String[] args) throws ClassNotFoundException {
		// TODO Auto-generated method stub
		Emp e=new Emp();
		e.setEno(202);
		e.setName("Krishna");
		e.setAddress("Vrindavan");
		e.setDateOfJoin(LocalDate.now());
		EmpDao dao=new EmpDaoImpl();
		dao.insert(e);
		dao.getAll().forEach(emp->System.out.println(emp.getEno()+"\t"+emp.getName()+"\t"+emp.getAddress()+"\t"+emp.getDateOfJoin()));
		//Emp e1=dao.get(1).orElseThrow(()->new ClassNotFoundException());
	}

}
