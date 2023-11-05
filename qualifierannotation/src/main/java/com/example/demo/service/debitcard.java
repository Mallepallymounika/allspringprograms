package com.example.demo.service;

import org.springframework.stereotype.Component;

@Component
public class debitcard implements payment{

	@Override
	public String paybill() {
		// TODO Auto-generated method stub
		return "paying bill through debitcard";
	}

}
