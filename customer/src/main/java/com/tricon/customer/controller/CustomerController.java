package com.tricon.customer.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.tricon.customer.model.Customer;
import com.tricon.customer.service.CustomerService;

@RestController
public class CustomerController {

	@Autowired
	private CustomerService customerService;

	@GetMapping("customer/get")
	public List<Customer> getCustomer() {
		return customerService.getCustomer();

	}
	
	@PostMapping("customer/add")
	public void addCustomer(@RequestBody Customer customer) {
		customerService.addCustomer(customer);
	}
}
