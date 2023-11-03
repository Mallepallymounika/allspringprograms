package com.example.demo.entity;

import java.util.ArrayList;
import java.util.List;

import jakarta.persistence.CascadeType;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.OneToMany;
import jakarta.persistence.Table;

@Entity
@Table(name="college")
public class College {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int id;
	private String collegeName;
	private int collegeCode;
	
	@OneToMany(cascade = CascadeType.ALL)
	@JoinColumn(name="p_id",referencedColumnName = "id")
	
	List<Students> a=new ArrayList<>();

	public College() {
		super();
		// TODO Auto-generated constructor stub
	}

	public College(String collegeName, int collegeCode, List<Students> a) {
		super();
		this.collegeName = collegeName;
		this.collegeCode = collegeCode;
		this.a = a;
	}

	public College(String collegeName, int collegeCode) {
		super();
		this.collegeName = collegeName;
		this.collegeCode = collegeCode;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getCollegeName() {
		return collegeName;
	}

	public void setCollegeName(String collegeName) {
		this.collegeName = collegeName;
	}

	public int getCollegeCode() {
		return collegeCode;
	}

	public void setCollegeCode(int collegeCode) {
		this.collegeCode = collegeCode;
	}

	public List<Students> getA() {
		return a;
	}

	public void setA(List<Students> a) {
		this.a = a;
	}
	
	

}
