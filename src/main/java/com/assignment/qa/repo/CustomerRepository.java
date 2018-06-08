package com.assignment.qa.repo;

import java.util.List;

import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.stereotype.Repository;

import com.assignment.qa.model.Customer;

@Repository
public interface CustomerRepository extends MongoRepository<Customer, String> {
	public Customer findByFirstName(String firstName);
	public List<Customer> findByMobileNumber(int mobileNumber);
}
	