package com.rays.exceptionhandling;

public class LoginException extends RuntimeException{
	public LoginException() {
		super("User not found");
		
	}
	

}
