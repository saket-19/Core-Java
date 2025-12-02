package com.rays.exceptionhandling;

public class TestLoginException {
	public static void main(String[]args) {
		String username="admin";
		if(username=="admin") {
			System.out.println("user found");
		}
		else {
			throw new LoginException();    //throw keyword in Java is used to manually throw an exception from your code. 
		}
	}

}
