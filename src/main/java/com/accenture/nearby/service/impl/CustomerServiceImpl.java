package com.accenture.nearby.service.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.accenture.nearby.entity.Customer;
import com.accenture.nearby.repository.CustomerRepository;
import com.accenture.nearby.service.CustomerService;

@Service
public class CustomerServiceImpl implements CustomerService {
	
	@Autowired
	private CustomerRepository customerRepository;

	@Override
	public List<Customer> getAllCustomersList() {
		return customerRepository.getAllCustomersList();
	}

	@Override
	public Customer registerCustomer(Customer customer) {
		return customerRepository.registerCustomer(customer);
	}

	@Override
	public void deleteCustomer(Integer customerId) {
		customerRepository.deleteCustomer(customerId);
	}

}
