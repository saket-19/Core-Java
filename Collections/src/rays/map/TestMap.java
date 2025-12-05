package rays.map;
import java.util.*;
//maps can have only 1 null key 
//maps can have multiple null values
//maps are unordered
//maps can have duplicate key values

public class TestMap {
	public static void main(String[]args) {
		Map m=new HashMap();    //concrete class of maps is hashmap 
		m.put(1, "one");        //inserting key values pair
		m.put(2, "two");        
		m.put(3, "three");
		m.put(null, null);     
		m.put(5,null);
		
		System.out.println(m.entrySet());
		System.out.println(m.get(2));
		System.out.println(m.containsKey(3));
		System.out.println(m.containsValue(6));
		System.out.println(m.size());
		System.out.println(m.isEmpty());
		System.out.println(m.keySet());
		System.out.println(m.values());
		System.out.println(m.remove(1));
		System.out.println(m.remove(null, null));
		System.out.println(m);		
	}

}
