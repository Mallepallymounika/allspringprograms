package com.example.demo.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import com.example.demo.service.creditcard;
@Component
public class atmController {
	private creditcard credit;
	
	@Autowired
	
	public atmController(creditcard credit) {
		super();
		this.credit = credit;
	}
	public String access() {
		return credit.paybill();
	}
}
