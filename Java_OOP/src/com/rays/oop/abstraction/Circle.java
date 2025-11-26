package com.rays.oop.abstraction;

public class Circle extends Shape {      //Concrete Class
	private int radius;
    
	public void setRadius(int radius) {
		this.radius=radius;
	}
	public int getRadius() {
		return radius;
	}
	public double area() {            //Abstract method of Class Shape
		return 3.14*radius*radius;
		
	}
}
