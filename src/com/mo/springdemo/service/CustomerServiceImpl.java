package com.mo.springdemo.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.mo.springdemo.dao.CustomerDAO;
import com.mo.springdemo.entity.Customer;
@Service
public class CustomerServiceImpl implements CustomerService {
	
	//inject dao
	@Autowired
	private CustomerDAO customerDAO;
	
	@Override
	@Transactional
	public List<Customer> getCustomers() {
		//i should put this in a try catch to handle dao problems
		return customerDAO.getCustomers();
	}

}
