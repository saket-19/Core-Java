package com.rays.oops.inheritance;
import java.text.ParseException;
import java.text.SimpleDateFormat;

public class TestPerson {
	public static void main(String[]args) throws ParseException {
		SimpleDateFormat sdf=new SimpleDateFormat("yyyy-MM-dd");
		
		//Businessman class (child 1)
		Businessman b=new Businessman();
		b.setIncome(10000.00);
		b.setName("Mukesh Ambani");
		b.setAddress("Mumbai");
		b.setDateOfBirth(sdf.parse("2002-02-02"));
		System.out.println(b.getName());
		System.out.println(b.getIncome());
		System.out.println(sdf.format(b.getDateOfBirth()));
		System.out.println();
		System.out.println("-------------");
		
		//Doctor class(child 2)
		Doctor d=new Doctor();
		d.setRegistrationNo("A14675767");
		d.setName("Sunil Sharma");
		d.setAddress("Indore");
		d.setDateOfBirth(sdf.parse("2000-03-12"));
		System.out.println(d.getName());
		System.out.println(d.getRegistrationNo());
		System.out.println(d.getAddress());
		System.out.print(sdf.format(d.getDateOfBirth()));
		System.out.println();
		System.out.println("-------------");
		
		//Student class(child 3)
		Student s=new Student();
		s.setName("Ramesh");
		s.setRollNo("1233546");
		s.setMarks(80);
		System.out.println(s.getName());
		System.out.println(s.getRollNo());
		System.out.println(s.getMarks());
		System.out.println();
		System.out.println("-------------");
		
		
		
		
	}

}
