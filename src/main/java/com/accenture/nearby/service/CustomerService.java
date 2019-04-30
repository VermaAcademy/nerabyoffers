package com.accenture.nearby.service;

import java.util.List;

import org.springframework.stereotype.Service;

import com.accenture.nearby.entity.Customer;

@Service
public interface CustomerService {

	List<Customer> getAllCustomersList();

	Customer registerCustomer(Customer customer);

	void deleteCustomer(Integer customerId);

}
