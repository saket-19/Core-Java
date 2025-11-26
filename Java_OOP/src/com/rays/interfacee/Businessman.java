package com.rays.interfacee;

public class Businessman extends Person implements Richman,SocialWorker{
	
	public void earnmoney() {
		System.out.println("Earn Money");
		
	}
	
	public void donation() {
		System.out.println("Donate Money and food");
	}
	
	public void party() {
		System.out.println("Enjoy parties");
	}
	public void helpothers() {
		System.out.println("Help others");
	}
	
	public static void main(String[]args) {
		Richman r=new Businessman();  //It calls only the methods of Richman interface
		r.earnmoney();
		r.donation();
		r.party();
		
		SocialWorker sc=new Businessman(); //It calls only the methods of Socialworker
		sc.helpothers();
		
		Businessman b=new Businessman();   //It calls both interface's methods together
		b.donation();
		b.earnmoney();
		b.party();
		b.helpothers();
		
		Person p=new Person();
		p.setName("Saket");
		System.out.println(p.getName());
		
	}
	
	
	
	

}
