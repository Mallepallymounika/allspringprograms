package com.example.demo;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;

import com.example.demo.controller.vegpizza;

@SpringBootApplication
public class AnnotationbaseprgramApplication {

	public static void main(String[] args) {
		ApplicationContext c= SpringApplication.run(AnnotationbaseprgramApplication.class, args);
	
		vegpizza v=c.getBean(vegpizza.class);
		System.out.println(v.getVegPizza());
	}

}
