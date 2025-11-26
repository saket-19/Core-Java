package com.rays.overriding;

public class Shape {
	private String color;
	private int border;

	public String getColor() {
		return color;
	}

	public void setColor(String color) {
		this.color = color;
	}

	public int getBorder() {
		return border;
	}

	public void setBorder(int border) {
		this.border = border;
	}

	public void area() {        ///Generalise method of base class
		System.out.println("Area of shape");
	}

}
