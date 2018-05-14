package com.mo.springdemo.dao;

import java.util.List;

import com.mo.springdemo.entity.Customer;

public interface CustomerDAO {

	public List<Customer> getCustomers();

	public void saveCustomer(Customer aCustomer);

	public Customer getCustomers(int theId);
}
