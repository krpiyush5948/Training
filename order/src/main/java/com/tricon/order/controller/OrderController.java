package com.tricon.order.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.tricon.order.model.Order;
import com.tricon.order.service.OrderService;

@RestController
public class OrderController {

	@Autowired
	private OrderService orderService;

	
	
	
	@PostMapping("create")
	public void CreateOrder(@RequestBody Order order) {
		orderService.CreateOrder(order);
	}
}
