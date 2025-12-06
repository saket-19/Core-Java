package rays.list;
import java.util.*;

import java.util.ArrayList;

public class ArraylistIterator{
	public static void main(String[]args) {
		ArrayList a=new ArrayList();
		a.add("hello");
        a.add("hy");
        a.add("yes");
        a.add("no");
        a.add(12);
       System.out.println(a);
        
        Iterator it=a.iterator();
        while(it.hasNext()) {
        	Object  o=it.next();
        	System.out.println(o);
        	it.remove();
        	System.out.println("List: " +a);
        }
        
        
        }   	
}
