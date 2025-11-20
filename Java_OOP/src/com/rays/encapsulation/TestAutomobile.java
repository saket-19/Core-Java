package com.rays.encapsulation;

public class TestAutomobile {
	public static void main(String[]args) {
		Automobile au=new Automobile();
		au.setColour("Blue");
		au.setSpeed(40);
		au.setMake("TATA");
		
		System.out.println(au.getColour());
		System.out.println(au.getSpeed());
		System.out.println(au.getMake());
		au.accelator();
		
		System.out.println(au.changeGear(4));
		System.out.println("Speed is : ");

		au.Break();
		System.out.println(au.changeGear(3));
		au.Break();
		
		
		
	}

}
