package com.rays.String;

public class CountAccurance {
	public static void main(String[]args) {
		int count=0;
		String str="google";
		char c='o';
		for(int i=0;i<str.length();i++) {
			if('o'==str.charAt(i)) {
				count++;
			}
		}
		System.out.println(count);
	}
		
		

}
