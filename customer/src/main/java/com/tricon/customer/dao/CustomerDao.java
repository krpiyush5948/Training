package com.tricon.customer.dao;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.tricon.customer.model.Customer;

@Repository
public interface CustomerDao extends JpaRepository<Customer,Integer> {

}
