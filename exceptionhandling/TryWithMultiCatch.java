package com.rays.exceptionhandling;

public class TryWithMultiCatch {
	public static void main(String[]args) {
		String a="rays";     //write null for nullpointer exception
		
		try {
			System.out.println(a.length());
			System.out.println(a.charAt(4));
			
		}
		catch(IndexOutOfBoundsException e) {
			System.out.println("Exception is : " +e.getMessage());
		
		}
		catch(NullPointerException e) {
			System.out.println("Exception is : " +e.getMessage());
			
		}
		
	}

}
