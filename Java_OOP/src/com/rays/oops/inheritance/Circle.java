package com.rays.oops.inheritance;

public class Circle extends Shape {
	private int radius;
    
	public void setRadius(int radius) {
		this.radius=radius;
	}
	public int getRadius() {
		return radius;
	}
	public void area() {
		System.out.println("Circle area : "+3.14*radius*radius);
	}
}
