package com.rays.overriding;

public class Circle extends Shape{
	private int radius;

	public int getRadius() {
		return radius;
	}

	public void setRadius(int radius) {
		this.radius = radius;
	}
	
	@Override
	public void area() {        //Specialised method 
		System.out.println("Area of Circle is : " +3.14*radius*radius);
	}
	
}