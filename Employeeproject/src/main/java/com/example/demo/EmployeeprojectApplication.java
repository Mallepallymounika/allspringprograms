package com.example.demo;


import java.util.List;
import java.util.function.Consumer;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import com.example.demo.entity.Employee;
import com.example.demo.repository.Employeerepo;


@SpringBootApplication
public class EmployeeprojectApplication implements CommandLineRunner {
	@Autowired
	private Employeerepo emprep;
	public static void main(String[] args) {
		SpringApplication.run(EmployeeprojectApplication.class, args);
	}

	@Override
	public void run(String... args) throws Exception {
		// TODO Auto-generated method stub
		Employee e=new Employee();
		e.setName("mounika");
		e.setAddress("hyderabad");
		e.setRole("developer");
		e.setSalary(50000);
		
		Employee e1=new Employee();
		e1.setName("vidhya");
		e1.setAddress("karimnagar");
		e1.setRole("salesforce");
		e1.setSalary(60000);
		
		Employee e2=new Employee();
		e2.setName("neha");
		e2.setAddress("hyderabad");
		e2.setRole("tester");
		e2.setSalary(51000);
		
		emprep.saveAll(List.of(e,e1,e2));
		
		
		System.out.println("inserted values");
		
		
		Integer id=1;
		Employee e3=emprep.findById(id).get();
		e3.setName("sowmya");
		e3.setAddress("ap");
		e3.setRole("salesforce");
		e3.setSalary(60000);
		System.out.println("updated 1st row");
		
		emprep.deleteById(2);
		System.out.println("deleted 2nd row");
		
		
		System.out.println("number of records");
		System.out.println(emprep.count());
		
		System.out.println(emprep.findAll());
		System.out.println(emprep.findById(4));
		
		System.out.println(emprep.existsById(8));
		
		
		System.out.println("clone");
	}

}
