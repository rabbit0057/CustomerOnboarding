package com.assignment.qa.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.autoconfigure.web.ErrorController;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.assignment.qa.model.Customer;
import com.assignment.qa.service.CustomerService;

@RestController
public class CustomerController implements ErrorController {

	@Autowired
	private CustomerService customerService;
	
	@RequestMapping("/error")
	public String handleError() {
		//do something like logging
		return "404 PAGE NOT FOUND";
	}
	@RequestMapping("/")	
	public String welcome() {
		//do something like logging
		return "WELCOME TO CUSTOMER ONBOARDING ";
	}
	
	// *********************Onboarding New Customer **********************        
	@RequestMapping(value = "/newCustomer")
	public String create(@RequestParam String firstName,@RequestParam String lastName, @RequestParam long mobileNumber, @RequestParam String location) {
		Customer c = customerService.create(firstName, lastName, mobileNumber, location);
		return c.toString();
		
	}
	// ********************* Show Customer data My FirstName **********************  
	
	@RequestMapping(value="/getCustomer")
	public Customer getCustomer(@RequestParam String firstName) {
		return customerService.getByFirstName(firstName);
	}
	
	// ********************* Show all Customer **********************        
	@RequestMapping("/getAllCustomer")
	public List<Customer>getAll(){
		return customerService.getAll();
	}
	// *********************Update Customer **********************        
	@RequestMapping("/UpdateCustomer")
	public String update(@RequestParam String firstName,@RequestParam String lastName, @RequestParam long mobileNumber, @RequestParam String location ) {
		Customer c = customerService.Update(firstName, lastName, mobileNumber, location);
		return c.toString();
	}
	// *********************Delete A Customer **********************        

	@RequestMapping("/deleteCustomer")
	public String delete(@RequestParam String firstName) {
		customerService.delete(firstName);
		return "Deleted "+firstName;
	}
	
	// *********************Delete All Customer **********************        

	@RequestMapping("/deleteAllCustomer")
	public String deleteAll() {
		customerService.deleteAll();
		return "Deleted All records";
		
	}
	@Override
	public String getErrorPath() {
		// TODO Auto-generated method stub
		return null;
	}

}

