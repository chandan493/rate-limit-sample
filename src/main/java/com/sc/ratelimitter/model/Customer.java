package com.sc.ratelimitter.model;

public class Customer {

	private String customerId;
	private String customerName;
	private String customerDesc;
	private String customerDOB;

	public Customer(String customerId, String customerName, String customerDesc, String customerDOB) {
		super();
		this.customerId = customerId;
		this.customerName = customerName;
		this.customerDesc = customerDesc;
		this.customerDOB = customerDOB;
	}

	public String getCustomerId() {
		return customerId;
	}

	public void setCustomerId(String customerId) {
		this.customerId = customerId;
	}

	public String getCustomerName() {
		return customerName;
	}

	public void setCustomerName(String customerName) {
		this.customerName = customerName;
	}

	public String getCustomerDesc() {
		return customerDesc;
	}

	public void setCustomerDesc(String customerDesc) {
		this.customerDesc = customerDesc;
	}

	public String getCustomerDOB() {
		return customerDOB;
	}

	public void setCustomerDOB(String customerDOB) {
		this.customerDOB = customerDOB;
	}

}
