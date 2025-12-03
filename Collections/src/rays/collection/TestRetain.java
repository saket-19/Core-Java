package rays.collection;
import java.util.*;

import java.util.Collection;

public class TestRetain {
	public static void main(String[]args) {
		Collection c1=new ArrayList();
		c1.add(1);
		c1.add(2);
		c1.add("saket");
		c1.add("singh");
		c1.add(10);
		
		System.out.println("c1 : "+c1);
		
		Collection c2=new ArrayList();
		c2.add("saket");
		c2.add(1);
		c2.add(11);
		c2.add(true);
		
		
		System.out.println("c2 : "+c2);
		
		c1.retainAll(c2);
		System.out.println(c1);
		
		System.out.println(c1.isEmpty());

		System.out.println(!c1.isEmpty());
		
		
		
		
	}

}
