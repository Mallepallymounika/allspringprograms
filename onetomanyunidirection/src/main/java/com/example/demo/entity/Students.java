package com.example.demo.entity;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Entity
@Table(name="student")
public class Students {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int id;
	private String sname;
	private String dep;
	public Students() {
		super();
		// TODO Auto-generated constructor stub
	}
	public Students(String sname, String dep) {
		super();
		this.sname = sname;
		this.dep = dep;
	}
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getSname() {
		return sname;
	}
	public void setSname(String sname) {
		this.sname = sname;
	}
	public String getDep() {
		return dep;
	}
	public void setDep(String dep) {
		this.dep = dep;
	}
	
	

}
