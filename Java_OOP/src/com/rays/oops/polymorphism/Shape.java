package com.rays.oops.polymorphism;

public class Shape {
	protected String color;
    protected int borderWidth;
	public String getColor() {
		return color;
	}
	public void setColor(String color) {
		this.color = color;
	}
	public int getBorderWidth() {
		return borderWidth;
	}
	public void setBorderWidth(int borderWidth) {
		this.borderWidth = borderWidth;
	}
	public void area() {
		System.out.println("area of shape");
		}
	public static Shape getShape(int i) {

	    if (i == 1) {
	        return new Circle();
	    } 
	    else if (i == 2) {
	        return new Rectangle();
	    } 
	    else if (i == 3) {
	        return new Triangle();
	    }

	    // return null if invalid number
	    return null;
	}

    
    
    

}
