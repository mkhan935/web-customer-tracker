package com.mo.springdemo.dao;

import java.util.List;



import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.query.Query;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;


import com.mo.springdemo.entity.Customer;

@Repository
public class CustomerDAOImpl implements CustomerDAO {

	//need to inject the session factory
	@Autowired
	private SessionFactory sessionFactory;
		
	@Override
	public List<Customer> getCustomers() {
		//get current session
		Session currentSession = sessionFactory.getCurrentSession();
		//create a query
		Query<Customer> query = currentSession.createQuery("from Customer", Customer.class);
		//exc query, get list
		List<Customer> customers = query.getResultList();
		//return list
		return customers;
	}

}
