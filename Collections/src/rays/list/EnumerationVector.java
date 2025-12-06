package rays.list;
import java.util.*;

public class EnumerationVector {
	public static void main(String[]args) {
		Vector v=new Vector();
		v.add("done");
		v.add(2);
		v.add('a');
		v.add(true);
		v.add("done");
		System.out.println(v);
		System.out.println("-----------------");
		
		Enumeration e=v.elements();
		v.add(1);
		while(e.hasMoreElements()) {
			Object o=e.nextElement();
			System.out.println(o);
		}
	}

}
