package com.rays.String;

public class CountDigit {
	public static void main(String[]args) {
		String str="Hello987hy";
		int count=0;
		for(int i=0;i<str.length();i++) {
			if(Character.isDigit(str.charAt(i))) {
				count++;
			}
		}
		System.out.println(count);
	}

}
