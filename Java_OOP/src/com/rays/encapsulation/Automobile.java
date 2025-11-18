package com.rays.encapsulation;

public class Automobile {
	private String colour;
	private int speed;
	private String make;
	
	public String getColour() {
		return colour;
	}
	public void setColour(String colour) {
		this.colour=colour;
	}
	
	public int getSpeed() {
		return speed;
	}
	public void setSpeed(int speed) {
		this.speed=speed;
	}
	
	public String getMake() {
		return make;
	}
	public void setMake(String make) {
		this.make=make;
	}
	public void accelator() {
		System.out.println("You have acclerated the vehicle !");
	}
	
		public int changeGear(int g) {
		if(g>=1 && g<=5) {
			System.out.print("Gear running currently is : ");
			return g;
		}
		else {
			System.out.print("Invalid gear = ");
			return g;
			
		}
		}
		public void Break() {
			if(speed>0) {
				speed=speed+5;
				
			}
			System.out.println(speed);
			
		}
	
		
		
	}
    

