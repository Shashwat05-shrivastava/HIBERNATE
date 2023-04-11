package org.shashwat.OnetoOne.entities;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.OneToOne;

@Entity
public class Passport {
	@Id
	private int pid;
	private String pno;
	
	@OneToOne(mappedBy="passport")
	private Student student;
	public Passport() {
		super();
		// TODO Auto-generated constructor stub
	}
	public Passport(int pid, String pno) {
		super();
		this.pid = pid;
		this.pno = pno;
	}
	public int getPid() {
		return pid;
	}
	public void setPid(int pid) {
		this.pid = pid;
	}
	public String getPno() {
		return pno;
	}
	public void setPno(String pno) {
		this.pno = pno;
	}
	public Student getStudent() {
		return student;
	}
	public void setStudent(Student student) {
		this.student = student;
	}
	
}
