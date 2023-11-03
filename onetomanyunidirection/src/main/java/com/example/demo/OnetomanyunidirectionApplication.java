package com.example.demo;

import org.hibernate.sql.ast.tree.expression.Collation;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import com.example.demo.entity.College;
import com.example.demo.entity.Students;
import com.example.demo.repository.Collegerepo;
import com.example.demo.repository.Studentrepo;

@SpringBootApplication
public class OnetomanyunidirectionApplication implements CommandLineRunner{
@Autowired
private Collegerepo collrep;

@Autowired
private Studentrepo stdrep;

	public static void main(String[] args) {
		SpringApplication.run(OnetomanyunidirectionApplication.class, args);
	}

@Override
public void run(String... args) throws Exception {
	// TODO Auto-generated method stub
	College c=new College("AVIH",1);
	
	Students s=new Students("mounika", "cse");
	Students s1=new Students("vidhy","CSE");
	c.getA().add(s);
	c.getA().add(s1);
	 
	collrep.save(c);
	
	
}

}
