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
	public void deposit(double amount) {
		balance=balance+amount;
		System.out.println(balance);
		
	}
	public void withdrawl(double amount) {
		if(balance>amount) {
			balance=balance-amount;
			System.out.println(balance);
			
		}
		else {
			System.err.println("Insufficient Balance !");
		}
		
	}

}
