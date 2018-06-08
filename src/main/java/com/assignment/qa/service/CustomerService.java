package com.assignment.qa.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.assignment.qa.model.Customer;
import com.assignment.qa.repo.CustomerRepository;

@Service
public class CustomerService {

	@Autowired
	private CustomerRepository customerRespository;

	//Create 

	public Customer create(String firstName,String lastName,long mobileNumber,String location) {
		return customerRespository.save(new Customer(firstName,lastName,mobileNumber,location));
	}

	//Retrieve

	public List<Customer> getAll(){
		return customerRespository.findAll();
	}
	public Customer getByFirstName(String firstName) {
		return customerRespository.findByFirstName(firstName);
	}

	//Update opertion

	public Customer Update(String firstName,String lastName,long mobileNumber, String location) {
		Customer c = customerRespository.findByFirstName(firstName);
		c.setLastName(lastName);
		c.setMobileNumber(mobileNumber);
		c.setLocation(location);
		return customerRespository.save(c);
	}
	//Delete 
	public void deleteAll() {
		customerRespository.deleteAll();
	}
	public void delete(String firstName){
		Customer c = customerRespository.findByFirstName(firstName);
		customerRespository.delete(c);
	}
}
