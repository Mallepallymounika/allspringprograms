package com.example.demo;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import com.example.demo.Entity.Amazon;
import com.example.demo.Repository.Amazonrepository;

@SpringBootApplication
public class SavingdataprmApplication implements CommandLineRunner{

	@Autowired
	private Amazonrepository amarep;
	public static void main(String[] args) {
		SpringApplication.run(SavingdataprmApplication.class, args);
	}

	@Override
	public void run(String... args) throws Exception {
		// TODO Auto-generated method stub
	Amazon a=new Amazon();
	a.setPname("laptop");
	
	
	Amazon a1=new Amazon();
	a.setPname("earpod");
	Amazon a2=new Amazon();
	a.setPname("bag");
	amarep.save(a);
	
	Amazon sav=amarep.findById(a.getId()).get();
	System.out.println(sav);
	
	}
}
