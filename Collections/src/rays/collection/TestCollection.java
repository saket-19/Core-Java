package rays.collection;

import java.util.Collection;
import java.util.ArrayList;

public class TestCollection {
	public static void main(String[]args) {
		Collection c=new ArrayList();
		
		c.add(8);
		c.add("saket");
		c.add(true);
		c.add(2.0);
		c.add('a');
		
		System.out.println(c);
		
		System.out.println("---------------------------");
		
		for(Object o:c) {    //To print the elements line by line
			System.out.println(o);
		}
		System.out.println("-----------------");
		
		System.out.println(c.contains(87));   //checks if it contains 87 or not,if yes then true else false
		System.out.println(c.contains('a'));  //returns true as 'a' is present there
		System.out.println("--------------------------");
		System.out.println(c.remove(87));     //remove 87 if it is present and if not then returns false
		System.out.println(c.remove('a'));    //remove 'a' if present and print "true"
		System.out.println(c);                //printing the collection after remove operation
		
		
		
		
		
	}
	
	
	
	

}
