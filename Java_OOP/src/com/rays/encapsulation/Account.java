package com.rays.encapsulation;

public class Account {
	private String number;
	private String type;
	private Double balance;
	
	public void setNumber(String number) {
		this.number=number;
	}
	public String getNumber() {
		return number;
	}
	public void setType(String type) {
		this.type=type;
	}
	public String getType() {
		return type;
	}
	public void setBalance(Double balance) {
		this.balance=balance;
	}
	public Double getBalance() {
		return balance;
	}

}
