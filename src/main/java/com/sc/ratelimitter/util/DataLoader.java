package com.sc.ratelimitter.util;

import java.util.ArrayList;
import java.util.List;

import org.springframework.stereotype.Component;

import com.sc.ratelimitter.model.Customer;
import com.sc.ratelimitter.model.Order;

@Component
public class DataLoader {

	public List<Customer> loadCustomers() {
		List<Customer> customers = new ArrayList<Customer>();
		Customer cust1 = new Customer("C1001", "Test Customer1", "test", "04/02/1991");
		Customer cust2 = new Customer("C1002", "Test Customer2", "test", "04/02/1990");
		Customer cust3 = new Customer("C1003", "Test Customer3", "test", "04/02/1989");
		customers.add(cust1);
		customers.add(cust2);
		customers.add(cust3);
		return customers;
	}

	public List<Order> loadOrders() {
		List<Order> orders = new ArrayList<Order>();
		Order order1 = new Order("ORD111", "Test Order1", "21/08/2020");
		Order order2 = new Order("ORD112", "Test Order2", "22/08/2020");
		Order order3 = new Order("ORD113", "Test Order3", "23/08/2020");
		orders.add(order1);
		orders.add(order2);
		orders.add(order3);
		return orders;
	}
}
