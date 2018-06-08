package com.assignment.qa.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.assignment.qa.model.Customer;
import com.assignment.qa.service.CustomerService;

@RestController
public class CustomerController {

	@Autowired
	private CustomerService customerService;

	@RequestMapping("/create")
	public String create(@RequestParam String firstName,@RequestParam String lastName, @RequestParam long mobileNumber, @RequestParam String location) {
		Customer c = customerService.create(firstName, lastName, mobileNumber, location);
		return c.toString();
	}
	@RequestMapping("/getAll")
	public List<Customer>getAll(){
		return customerService.getAll();
	}
	@RequestMapping("/Update")
	public String update(@RequestParam String firstName,@RequestParam String lastName, @RequestParam long mobileNumber, @RequestParam String location ) {
		Customer c = customerService.Update(firstName, lastName, mobileNumber, location);
		return c.toString();
	}
	@RequestMapping("/delete")
	public String delete(@RequestParam String firstName) {
		customerService.delete(firstName);
		return "Deleted "+firstName;
	}
	@RequestMapping("/deleteAll")
	public String deleteAll() {
		customerService.deleteAll();
		return "Deleted All records";
		
	}

}

