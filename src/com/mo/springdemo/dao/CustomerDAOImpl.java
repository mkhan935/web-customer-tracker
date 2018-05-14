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
		Query<Customer> query = currentSession.createQuery("from Customer order by lastName", Customer.class);
		//exc query, get list
		List<Customer> customers = query.getResultList();
		//return list
		return customers;
	}

	@Override
	public void saveCustomer(Customer aCustomer) {
		// get the current  session
		Session currentSession = sessionFactory.getCurrentSession();
		//save/update the customer to db
		currentSession.saveOrUpdate(aCustomer);
		
	}

	@Override
	public Customer getCustomers(int theId) {
		Session currentSession = sessionFactory.getCurrentSession();
		
		return currentSession.get(Customer.class, theId);
	}

}
