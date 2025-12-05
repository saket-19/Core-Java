package rays.list;

import java.util.ArrayList;

public class TestArrayList {
	public static void main(String[]args) {
		ArrayList a=new ArrayList();
		a.add("zero");
		a.add("one");
		a.add("two");
		a.add("three");
		a.add("five");
		a.add(4,"four");   //inserting element on 4th index
		
		System.out.println(a);
		
		String val=(String)a.get(1);
		System.out.println(val);
		
		for(Object ele:a) {
			String str=(String)ele;
			System.out.println(str);
		}
		
		
		
	}

}
