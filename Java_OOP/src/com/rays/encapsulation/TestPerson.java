package com.rays.encapsulation;

import java.util.Date;
import java.text.ParseException;
import java.text.SimpleDateFormat;

public class TestPerson {
	public static void main(String[] args) throws ParseException {
		Person p1 = new Person();
		Date d = new Date();

		p1.setName("Saket Singh");
		SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd");

		p1.setDob(sdf.parse("2002-02-02"));
		p1.getDob();
		p1.setAddress("Indore");

		System.out.println(p1.getName());

		System.out.println(p1.getAddress());
		System.out.println(sdf.format(p1.getDob()));
		System.out.println(p1.getAge(p1.getDob()));

	}

}
