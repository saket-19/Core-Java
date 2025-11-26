package com.rays.oops.polymorphism;

public class OverloadingEgCalculator{
	public void sum(int a,int b) {
		System.out.println("Sum of given numbers is : " + (a+b));
	}
	
	public void sum(int a,int b,int c) {
		System.out.println("Sum of given numbers is : " + (a+b+c));
	}
	
	public static void main(String[]args) {
		OverloadingEgCalculator c=new OverloadingEgCalculator();
		c.sum(3,4);
		c.sum(4,5,8);
	}
}