package com.learn.java;

public class Order {
	private int orderNum;
	private int orderAmt;
	private String orderName;

	public Order(int orderNum, int orderAmt, String orderName) {
		this.orderNum = orderNum;
		this.orderAmt = orderAmt;
		this.orderName = orderName;
	}

	public Order() {
	}

	public int getOrderNum() {
		return orderNum;
	}

	public void setOrderNum(int orderNum) {
		this.orderNum = orderNum;
	}

	public int getOrderAmt() {
		return orderAmt;
	}

	public void setOrderAmt(int orderAmt) {
		this.orderAmt = orderAmt;
	}

	public String getOrderName() {
		return orderName;
	}

	public void setOrderName(String orderName) {
		this.orderName = orderName;
	}

}
