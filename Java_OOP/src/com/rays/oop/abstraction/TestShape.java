package com.rays.oop.abstraction;

public class TestShape {
	public static void main(String[]args) {
		Circle c=new Circle();
		c.setColor("Red");
		c.setRadius(2);
		c.setBorderWidth(3);
		
		System.err.println(c.getColor());
		System.out.println(c.getRadius());
		System.out.println(c.getBorderWidth());
		
		
		
		System.out.println(c.area());
		
	}

}
