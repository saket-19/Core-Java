package com.rays.encapsulation;

public class TestAccount {
	public static void main(String[]args) {
		Account a1=new Account();
		a1.setNumber("TMB00866455465");
		a1.setType("Saving");
		a1.setBalance(11000.000);
		
		System.out.println(a1.getNumber());
		System.out.println(a1.getType());
		System.out.println(a1.getBalance());
		a1.deposit(1000.00);
		a1.withdrawl(50000.00);
		
		
	}

}
