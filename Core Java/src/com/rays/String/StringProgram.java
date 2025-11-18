package com.rays.String;

public class StringProgram {
	public static void main(String[]args) {
		String str="Saket Singh Parihar";
		System.out.println(str);
		 System.out.println("Length of String is :" +str.length()); //length
		 System.out.println("index of a is " + str.indexOf('a'));
		 System.out.println(str.charAt(4));
		 
		 System.out.println("String in uppercase is :" +str.toUpperCase());
		 System.out.println("String in lowercase is :" +str.toLowerCase());
		 System.out.println("Replaced string is  :" +str.replace('S','R'));
		 System.out.println("Is the String starts with saket  :" +str.startsWith("Saket"));
		 System.out.println("Is String ends with har :" +str.endsWith("har"));
		 System.out.println(str.substring(3,8));
		 
		 
		 
		 
		 
		
	}

}
