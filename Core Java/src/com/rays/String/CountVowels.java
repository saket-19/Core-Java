package com.rays.String;

public class CountVowels {
	public static void main(String[]args) {
		int count=0;
		String str="saket";
		for(int i=0;i<str.length();i++) {
			if('a'==str.charAt(i)||'e'==str.charAt(i)||'i'==str.charAt(i)||'o'==str.charAt(i)||'u'==str.charAt(i)) {
				count++;
			}
		}
		System.out.println(count);;
	}

}
