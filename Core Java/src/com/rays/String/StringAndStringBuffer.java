package com.rays.String;

public class StringAndStringBuffer {
	public static void main(String[]args) {
		String str="hello world";
		System.out.println(str.replace('w', 'm'));
		System.out.println(str);
		System.out.println("--------------------");
		
		StringBuffer sb=new StringBuffer("Hey");
		System.out.println(sb.append(" world"));
		System.out.println(sb);
	}

}
