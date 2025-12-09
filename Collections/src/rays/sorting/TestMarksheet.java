package rays.sorting;
import java.util.*;

public class TestMarksheet {
	public static void main(String[]args) {
		Marksheet m1=new Marksheet("en21cs57","sai",34,33,33);
		Marksheet m2=new Marksheet("en21cs58","saket",45,35,33);
		Marksheet m3=new Marksheet("en21cs59","Saksham",39,34,33);
		Marksheet m4=new Marksheet("en21cs60","Sahaj",30,33,32);
		Marksheet m5=new Marksheet("en21cs61","Sakshi",37,44,36); 
		
		ArrayList list=new ArrayList();
		list.add(m1);
		list.add(m2);
		list.add(m3);
		list.add(m4);
		list.add(m5);
		
		for(Object o:list) {
			System.out.println(o);
		}
		
		
			
	}
	
	

}
