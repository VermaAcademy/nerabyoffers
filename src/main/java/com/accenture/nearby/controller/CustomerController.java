package com.accenture.nearby.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.accenture.nearby.entity.Customer;
import com.accenture.nearby.service.CustomerService;

import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import io.swagger.annotations.ApiResponse;
import io.swagger.annotations.ApiResponses;
import lombok.extern.slf4j.Slf4j;

@CrossOrigin
@RestController
@Slf4j
@Api(value = "CustomerController", produces = MediaType.APPLICATION_JSON_VALUE)
@RequestMapping("/customers")
public class CustomerController {

	@Autowired
	private CustomerService customerService;

	@RequestMapping(value = "/getAllCustomers", method = RequestMethod.GET)
	@ApiOperation("Get the all resitered customer list")
	@ApiResponses(value = { @ApiResponse(code = 200, message = "OK", response = Customer.class) })
	public ResponseEntity<List<Customer>> getAllCustomersList() {
		log.info("Enter into getAllCustomersList() :: CustomerController");
		List<Customer> customerList = customerService.getAllCustomersList();
		log.info("Exit from getAllCustomersList() :: CustomerController");
		if(customerList != null && !customerList.isEmpty())
			return new ResponseEntity<List<Customer>>(customerList, HttpStatus.OK);
		return new ResponseEntity<List<Customer>>(customerList, HttpStatus.INTERNAL_SERVER_ERROR);
	}

	@RequestMapping(value = "/registerCustomer", method = RequestMethod.POST)
	@ApiOperation("Register Customer information")
	@ApiResponses(value = { @ApiResponse(code = 200, message = "OK", response = Customer.class) })
	public ResponseEntity<Customer> registerCustomer(@RequestBody Customer customer) {
		log.info("Enter into registerCustomer() :: CustomerController");
		customer = customerService.registerCustomer(customer);
		log.info("Exit from registerCustomer() :: CustomerController");
		if(customer !=null)
			return new ResponseEntity<Customer>(customer, HttpStatus.CREATED);
		return new ResponseEntity<Customer>(customer, HttpStatus.INTERNAL_SERVER_ERROR);
	}

	@RequestMapping(path = "{customerId}", method = RequestMethod.DELETE)
	@ApiOperation("Delete the customer with specific customer id")
	@ApiResponses(value = { @ApiResponse(code = 200, message = "OK", response = String.class) })
	public ResponseEntity<Customer> deleteCustomer(@PathVariable(name = "customerId") Integer customerId) {
		log.info("Enter into deleteCustomer() :: CustomerController");
		customerService.deleteCustomer(customerId);
		Customer customer = new Customer();
		customer.setCustomerId(customerId);
		log.info("Exit from deleteCustomer() :: CustomerController");
		return new ResponseEntity<Customer>(customer, HttpStatus.OK);
	}

}
