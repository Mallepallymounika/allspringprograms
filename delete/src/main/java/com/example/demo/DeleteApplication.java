package com.example.demo;

import java.util.Optional;

import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import com.example.demo.entity.Student;
import com.example.demo.repository.studentrepo;

@SpringBootApplication
public class DeleteApplication  implements CommandLineRunner{
private studentrepo stdrepo;
	public static void main(String[] args) {
		SpringApplication.run(DeleteApplication.class, args);
	}

	@Override
	public void run(String... args) throws Exception {
		// TODO Auto-generated method stub
		Student s=new Student();
		s.setId(1);
		s.setAddress("hyd");
		s.setName("mounika");
		Student s1=new Student();
		s1.setAddress("bnlr");
		s1.setName("vaishu");
		stdrepo.save(s);
		stdrepo.save(s1);
	Boolean status=stdrepo.existsById(1);
	System.out.print(status);
	if(status)
	{
		System.out.println("id is present");
		
	}
	else {
		System.out.println("id is not present");
	}
	}

}
