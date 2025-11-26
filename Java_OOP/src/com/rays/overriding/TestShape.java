package com.rays.overriding;

public class TestShape {
	public static void main(String[]args) {
		Shape s=new Circle();        //Parent class object
		Circle c=(Circle) s;         // Typecaste of shape class 
		c.setColor("Red");
		c.setRadius(3);
		
		System.out.println(c.getColor());
		System.out.println(c.getRadius());
		c.area();
		
		
		
	}

}
