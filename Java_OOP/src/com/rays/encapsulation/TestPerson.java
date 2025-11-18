package com.rays.encapsulation;

import java.util.Date;

public class TestPerson {
	public static void main(String[] args) {
		Person p1 = new Person();

		Date d = new Date();
		p1.setName("Saket Singh");
		p1.setDob(d);
		p1.setAddress("Indore");

		System.out.println(p1.getName());
		System.out.println(p1.getDob());
		System.out.println(p1.getAddress());

	}

}
