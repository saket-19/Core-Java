package com.rays.oops.polymorphism;

public class TestPolymorphismByArray {
	public static void main(String[]args) {
		Shape[] s=new Shape[3];
		
		s[0]=new Circle();
		s[1]=new Rectangle();
		s[2]=new Triangle();
		
		Circle c=(Circle)s[0];
		c.setRadius(4);
		
		Rectangle r=(Rectangle)s[1];
		r.setLength(6);
		r.setWidth(3);
		
		Triangle t=(Triangle)s[2];
		t.setBase(5);
		t.setHeight(7);
		
		for(int i=0;i<s.length;i++) {
			s[i].area();
		}
		
		
		
	}

}
