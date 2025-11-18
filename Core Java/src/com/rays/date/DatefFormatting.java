package com.rays.date;

import java.text.SimpleDateFormat;
import java.util.Date;

public class DatefFormatting {
	public static void main(String[]args) {
		SimpleDateFormat sdf=new SimpleDateFormat("yyyy-mm--dd");
		Date d=new Date();
		System.out.println("Default date : " +d);
		String s=sdf.format(d);
		System.out.println("formatted date : " +s);
		
	}

}
