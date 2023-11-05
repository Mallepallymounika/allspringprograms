package com.example.demo.service;

import org.springframework.stereotype.Component;

@Component
public class creditcard implements payment {

	@Override
	public String paybill() {
		// TODO Auto-generated method stub
		return "paying bill through creditcard";
	}

}
