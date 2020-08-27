package com.sc.ratelimitter.model;

public class Order {

	private String orderId;
	private String orderDesc;
	private String orderPlacedDate;

	public Order(String orderId, String orderDesc, String orderPlacedDate) {
		super();
		this.orderId = orderId;
		this.orderDesc = orderDesc;
		this.orderPlacedDate = orderPlacedDate;
	}

	public String getOrderId() {
		return orderId;
	}

	public void setOrderId(String orderId) {
		this.orderId = orderId;
	}

	public String getOrderDesc() {
		return orderDesc;
	}

	public void setOrderDesc(String orderDesc) {
		this.orderDesc = orderDesc;
	}

	public String getOrderPlacedDate() {
		return orderPlacedDate;
	}

	public void setOrderPlacedDate(String orderPlacedDate) {
		this.orderPlacedDate = orderPlacedDate;
	}

}
