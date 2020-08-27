package com.sc.ratelimitter.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.sc.ratelimitter.model.Order;
import com.sc.ratelimitter.util.DataLoader;

@RestController
@RequestMapping("order")
public class OrderController {

	@Autowired
	DataLoader dl;

	@GetMapping(value = "/all")
	public List<Order> getAllOrders() {
		return dl.loadOrders();
	}
}
