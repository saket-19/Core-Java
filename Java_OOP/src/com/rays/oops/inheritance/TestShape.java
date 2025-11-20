package com.rays.oops.inheritance;

public class TestShape {
	public static void main(String[]args) {
		Circle c=new Circle();
		c.setColor("Red");
		c.setRadius(2);
		c.setBorderWidth(3);
		
		System.err.println(c.getColor());
		System.out.println(c.getRadius());
		System.out.println(c.getBorderWidth());
		c.area();
		
		Rectangle r=new Rectangle();
		r.setColor("Blue");
		r.setLength(6);
		r.setWidth(3);
		
		
		System.out.println("-----------------");
		System.out.println(r.getColor());
		System.out.println(r.getLength());
		System.out.println(r.getWidth());
		r.area();
		
	}

}
