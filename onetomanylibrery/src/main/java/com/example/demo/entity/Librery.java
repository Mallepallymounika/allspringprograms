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
@Table(name="Library")
public class Librery {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	
	private int id;
	private String lname;
	

	@OneToMany(cascade = CascadeType.ALL)
	@JoinColumn(name="l_id",referencedColumnName = "id")
	List<Book> a=new ArrayList<>();
	
	

	public Librery() {
		super();
		// TODO Auto-generated constructor stub
	}

	public Librery(String lname) {
		super();
		this.lname = lname;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getLname() {
		return lname;
	}

	public void setLname(String lname) {
		this.lname = lname;
	}

	public List<Book> getA() {
		return a;
	}

	public void setA(List<Book> a) {
		this.a= a;
	}

	

}
