package com.example.demo.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;

import com.example.demo.service.payment;

@Component
public class paymentprocessor {
	private payment pay;
@Autowired
	public paymentprocessor(@Qualifier("creditcard")payment pay) {
		super();
		this.pay = pay;
	}
	public String makepayment() {
		return pay.paybill();
	}

}
