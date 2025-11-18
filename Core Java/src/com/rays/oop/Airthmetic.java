package com.rays.oop;

public class Airthmetic {
	public void sum(int a, int b) {
		System.out.println(a+b);
	}
	public void sub(int a,int b) {
		System.out.println(a-b);
	}
	public void divide(int a, int b) {
		System.out.println(a/b);
	}
	public int getMaxNo(int a,int b) {
		if(a>b) {
			return a;
		}
		else {
			return b;
		}
	}
	public String getOddEven(int a) {
		if(a%2==0) {
			return "Even"; 
		}
		else {
			return "Odd";
		}
	}

}
