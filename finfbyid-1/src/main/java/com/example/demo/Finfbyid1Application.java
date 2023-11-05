package com.example.demo;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import com.example.demo.entity.student;
import com.example.demo.repository.studentrep;

@SpringBootApplication
public class Finfbyid1Application implements CommandLineRunner{

	@Autowired
	private studentrep stdrep;
	public static void main(String[] args) {
		SpringApplication.run(Finfbyid1Application.class, args);
	}
	@Override
	public void run(String... args) throws Exception {
		// TODO Auto-generated method stub
		
		//student s=new student();
		//s.setName("mounika");
		
		//s.setDep("cse");
		//stdrep.save(s);
		Integer id=1;
		
	
	student s=stdrep.findById(id).get();
	s.setDep("ece");
	s.setName("vidhya");
	
	
	stdrep.save(s);
	}}
