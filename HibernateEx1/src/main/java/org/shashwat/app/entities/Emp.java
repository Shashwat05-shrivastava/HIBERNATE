package org.shashwat.app.entities;

import java.time.LocalDate;
import javax.persistence.Entity;

@Entity
public class Emp {
	
	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	private int eno;
	private String name;
	private LocalDate dateOfJoin;
	public Emp() {
		super();
		// TODO Auto-generated constructor stub
	}
	public Emp(int eno, String name, LocalDate dateOfJoin) {
		super();
		this.eno = eno;
		this.name = name;
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
	public LocalDate getDateOfJoin() {
		return dateOfJoin;
	}
	public void setDateOfJoin(LocalDate dateOfJoin) {
		this.dateOfJoin = dateOfJoin;
	}
	
	
}
