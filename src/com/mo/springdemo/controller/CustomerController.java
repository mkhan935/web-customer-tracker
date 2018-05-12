package com.mo.springdemo.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("/customer")
public class CustomerController {
	
	@RequestMapping("/list")
	public String listCustomer(Model testModel) {
		return "list-customers"; //this returns "list-customer.jsp"
	}

}
