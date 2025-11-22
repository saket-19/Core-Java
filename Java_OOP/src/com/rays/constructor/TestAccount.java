package com.rays.constructor;

public class TestAccount {
	public static void main(String[]args) {
		Account ac=new Account("1565768","Saving",2000.00);
		System.out.println("Account number : " +ac.getNumber());
		System.out.println("Account Type : " +ac.getAccountType());
		System.out.println("Account balance : " +ac.getBalance());
		
	}

}
