package com.tricon.order.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.tricon.order.dao.OrderDao;
import com.tricon.order.model.Order;
@Service
public class OrderService {

	
	@Autowired
	private OrderDao orderDao;
	
	public void CreateOrder(Order order) {
		// TODO Auto-generated method stub
		   orderDao.save(order);
	}

}
