package com.tricon.customer.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;

import com.tricon.customer.dao.CustomerDao;
import com.tricon.customer.model.Customer;

@org.springframework.stereotype.Service
public class CustomerService {

	
	@Autowired
	private CustomerDao customerDao;
	public List<Customer> getCustomer() {
		// TODO Auto-generated method stub
		return customerDao.findAll() ;
	}
	public void addCustomer(Customer customer) {
		// TODO Auto-generated method stub
		customerDao.save(customer);
	}

}
