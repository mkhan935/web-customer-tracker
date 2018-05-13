package com.mo.springdemo.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

import com.mo.springdemo.dao.CustomerDAO;
import com.mo.springdemo.entity.Customer;

@Controller
@RequestMapping("/customer")
public class CustomerController {
	
	//inject customer dao
	@Autowired
	private CustomerDAO customerDAO;
	
	@RequestMapping("/list")
	public String listCustomer(Model testModel) {
		// get customers from dao
		List<Customer> listOfCustomers = customerDAO.getCustomers();
		
		//add customers to model
		testModel.addAttribute("customers",listOfCustomers);
		//send to view
		return "list-customers"; //this returns "list-customer.jsp"
	}

}
