package com.example.demo;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;

import com.example.demo.controller.paymentprocessor;

@SpringBootApplication
public class QualifierannotationApplication {

	public static void main(String[] args) {
	ApplicationContext c=SpringApplication.run(QualifierannotationApplication.class, args);
	paymentprocessor p=c.getBean(paymentprocessor.class);
	System.out.println(p.makepayment());
	
	}

}
