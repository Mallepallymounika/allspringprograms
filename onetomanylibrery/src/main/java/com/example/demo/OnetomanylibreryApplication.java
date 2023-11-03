package com.example.demo;

import org.apache.tomcat.jni.Library;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import com.example.demo.entity.Book;
import com.example.demo.entity.Librery;
import com.example.demo.repository.Bookrepo;
import com.example.demo.repository.Libreryrepo;

@SpringBootApplication
public class OnetomanylibreryApplication implements CommandLineRunner {
@Autowired
private Libreryrepo lirepo;



@Autowired
private Bookrepo brepo;
	public static void main(String[] args) {
		SpringApplication.run(OnetomanylibreryApplication.class, args);
	}
	@Override
	public void run(String... args) throws Exception {
	
		// TODO Auto-generated method stub
		
		Librery l=new Librery("Library");
		
		Book b=new Book("APJ");
		Book b1=new Book("wings of fire");
		
  l.getA().add(b);
  l.getA().add(b1);
  
  lirepo.save(l);
		
	}

}
