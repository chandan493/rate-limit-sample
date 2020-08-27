package com.sc.ratelimitter.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.sc.ratelimitter.model.Customer;
import com.sc.ratelimitter.util.DataLoader;

@RestController
@RequestMapping("customer")
public class CustomerController {
	@Autowired
	DataLoader dl;

	@GetMapping(value = "/all")
	public List<Customer> getAllCustomers() {
		return dl.loadCustomers();
	}
}
