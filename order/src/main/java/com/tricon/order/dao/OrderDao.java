package com.tricon.order.dao;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.tricon.order.model.Order;

@Repository
public interface OrderDao extends JpaRepository<Order,Integer> {

}
