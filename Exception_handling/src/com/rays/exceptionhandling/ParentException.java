package com.rays.exceptionhandling;

public class ParentException {
	public static void main(String[]args) {
		String s=null;
		try {
			System.out.println(s.length());
		}
		catch(Exception e) {  //just need to write Exception if exception name is not known
			System.out.println(e.getMessage());
		}
	}

}
