package rays.list;  


import java.util.List;
import java.util.ArrayList;

public class TestList {
	public static void main(String[]args) {
		List l=new ArrayList();
		l.add(0,1);
		l.add(1,"Ram");
		l.add(2,"Rawan");
		l.add(3,'a');
		
		
		System.out.println("List : " +l);
		System.out.println(l.get(3));
	
		
		l.remove(0);
		System.out.println("List after removing 0 indexed element : " +l);
		System.out.println();
		
		l.set(0, "Rawan");
		System.out.println("List after replacing 0 index with rawan : " +l);
		System.out.println();
		
		System.out.println("Index of rawan is : " +l.indexOf("Rawan"));
		System.out.println();
		
		System.out.println(l.lastIndexOf("Rawan"));
		System.out.println(l.subList(1, 3));
		
		
		
		
	}

}
