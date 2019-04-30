package com.accenture.nearby.repository;

import java.util.List;

import org.springframework.stereotype.Repository;

import com.accenture.nearby.entity.Customer;

@Repository
public interface CustomerRepository {

	List<Customer> getAllCustomersList();

	Customer registerCustomer(Customer customer);

	void deleteCustomer(Integer customerId);

}
