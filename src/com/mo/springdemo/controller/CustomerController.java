package com.mo.springdemo.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

import com.mo.springdemo.dao.CustomerDAO;
import com.mo.springdemo.entity.Customer;
import com.mo.springdemo.service.CustomerService;

@Controller
@RequestMapping("/customer")
public class CustomerController {
	
	//inject customer service
	@Autowired
	private CustomerService customerService;
	
	@GetMapping("/list") //getMapping only get requests allowed
	public String listCustomer(Model testModel) {
		// get customers from service
		List<Customer> listOfCustomers = customerService.getCustomers();
		
		//add customers to model
		testModel.addAttribute("customers",listOfCustomers);
		//send to view
		return "list-customers"; //this returns "list-customer.jsp"
	}
	
	@GetMapping("/showFormForAdd")
	public String showFormForAdd(Model testModel2) {
		//create model to bind data to
		Customer aCustomer = new Customer();
		testModel2.addAttribute("customer", aCustomer);
		
		return "customer-form";
	}

	@PostMapping("/saveCustomer")
	public String saveCustomer(@ModelAttribute("customer")Customer aCustomer) {
		// save the customer
		customerService.saveCustomer(aCustomer);
		
		return "redirect:/customer/list";
	}
	
	@GetMapping("/showFormForUpdate")
	public String showFormForUpdate(@RequestParam("customerId") int theId, Model testModel3) {
		//get customer from service
		Customer aCustomer = customerService.getCustomers(theId);
		//set model as the customer retrieved
		testModel3.addAttribute("customer",aCustomer);
		//send it to the form to pre-populate the form
		return "customer-form";
	}
	
	@GetMapping("/delete")
	public String deleteCustomer(@RequestParam("customerId") int theId) {
		//get customer from service
		customerService.deleteCustomer(theId);
		return "redirect:/customer/list";
	}
	
	 @PostMapping("/search")
	    public String searchCustomers(@RequestParam("theSearchName") String theSearchName,
	                                    Model theModel) {

	        // search customers from the service
	        List<Customer> theCustomers = customerService.searchCustomers(theSearchName);
	                
	        // add the customers to the model
	        theModel.addAttribute("customers", theCustomers);

	        return "list-customers";        
	    }
	
	
}
