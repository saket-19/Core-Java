package rays.sorting;
import java.util.*;

public class TestSchool {
	public static void main(String[]args) {
		//School s=new School();
		ArrayList list=new ArrayList();
		list.add(new School("harry",1,30));
		list.add(new School("shampy",2,28));
		list.add(new School("dora",5,25));
		list.add(new School("harry",3,27));
		list.add(new School("shampy",4,28));
		
		list.forEach(System.out::println);
		
		System.out.println("----sorting by name----");
		OrderByName byname=new OrderByName();
		Collections.sort(list, byname);
		list.forEach(System.out::println);
		
		System.out.println("----sorting by rollno----");
		OrderByRollno byrollno=new OrderByRollno();
		Collections.sort(list, byrollno);
		list.forEach(System.out::println);
		
		System.out.println("----sorting by condition----");
		OrderByCondition bycondition=new OrderByCondition();
		Collections.sort(list, bycondition);
		list.forEach(System.out::println);
		
		
		
		
		
		
	}

}
