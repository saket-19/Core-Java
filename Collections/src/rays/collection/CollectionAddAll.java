package rays.collection;

import java.util.ArrayList;
import java.util.Collection;

public class CollectionAddAll {
	public static void main(String[]args) {
		Collection c1=new ArrayList();
		c1.add(45);
		c1.add("hello");
		c1.add(false);
		c1.add('b');
		
		System.out.println(c1);
		System.out.println("size of c1 is : " +c1.size());
		
		System.out.println("-------------------");
		
		Collection c2=new ArrayList();
		c2.add(3);
		c2.add("world");
		c2.add(true);
		
		System.out.println(c2);
		System.out.println("Size of c2 is : " +c2.size());
		
		System.out.println("-------------------");
		
		c1.addAll(c2);
		System.out.println("c1 after adding c2 is : "+c1);
		
		System.out.println(c1.removeAll(c2));
		System.out.println("c1 after removing c2 is : "+c1);
		
		
		
		
		
		
		
	}

}
