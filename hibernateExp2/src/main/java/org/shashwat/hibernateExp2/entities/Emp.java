package org.shashwat.hibernateExp2.entities;

import java.time.LocalDate;

public class Emp {
	private int eno;
	private String name;
	private String address;
	private LocalDate dateOfJoin;
	public Emp() {
		super();
		// TODO Auto-generated constructor stub
	}
	public Emp(int eno, String name, String address, LocalDate dateOfJoin) {
		super();
		this.eno = eno;
		this.name = name;
		this.address = address;
		this.dateOfJoin = dateOfJoin;
	}
	public int getEno() {
		return eno;
	}
	public void setEno(int eno) {
		this.eno = eno;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getAddress() {
		return address;
	}
	public void setAddress(String address) {
		this.address = address;
	}
	public LocalDate getDateOfJoin() {
		return dateOfJoin;
	}
	public void setDateOfJoin(LocalDate dateOfJoin) {
		this.dateOfJoin = dateOfJoin;
	}
	@Override
	public String toString() {
		// TODO Auto-generated method stub
		return this.eno + ":" + this.name + ":" + this.address + ":" + this.dateOfJoin;
	}
	
	
	
}
