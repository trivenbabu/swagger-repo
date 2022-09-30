package com.sts.rest.entity;

import javax.persistence.Entity;
import javax.persistence.Id;

@Entity
public class Orders {
	@Id
	private int orderId;
	private String orderName;
	private int qty;
	public int getOrderId() {
		return orderId;
	}
	public void setOrderId(int orderId) {
		this.orderId = orderId;
	}
	public String getOrderName() {
		return orderName;
	}
	public void setOrderName(String orderName) {
		this.orderName = orderName;
	}
	public int getQty() {
		return qty;
	}
	public void setQty(int qty) {
		this.qty = qty;
	}
	public Orders(int orderId, String orderName, int qty) {
		super();
		this.orderId = orderId;
		this.orderName = orderName;
		this.qty = qty;
	}
	public Orders() {
		super();
		
	}
	@Override
	public String toString() {
		return "Order [orderId=" + orderId + ", orderName=" + orderName + ", qty=" + qty + "]";
	}
	

}
