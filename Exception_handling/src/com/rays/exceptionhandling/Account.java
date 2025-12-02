package com.rays.exceptionhandling;

public class Account {
	private double balance;

	public double getBalance() {
		return balance;
	}

	public void setBalance(double balance) {
		this.balance = balance;
	}
	public  void withdrawl(double amount) {
		if(amount>this.balance) {
			try {
			throw new InsufficientFundException();
			}
			catch(InsufficientFundException e) {
				System.out.println(e.getMessage());
			}
		}
		else {
			this.balance=this.balance-amount;
			System.out.println("new balance : " +this.balance);
		}
		
	}
	
}
	
				
			
		
	
	
	
	


