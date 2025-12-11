package rays.stream;
import java.util.*;
public class StreamTest {
	public static void main(String[]args) {
		ArrayList<String> list=new ArrayList<String>();
		list.add("Krishna");
		list.add("Kanha");
		list.add("Kans");
		list.add("Balraam");
		list.add("Krishna");
		list.add("Radha");
		list.add("Yamuna");
		
		list.forEach(System.out::println);
		System.out.println("------------");
		
		list.stream().sorted().forEach(System.out::println);  //sorting in ascending order
		System.out.println("------------");
        list.stream().sorted().distinct().forEach(System.out::println); //sorting in asc order and removing duplicate elements
	    
    	System.out.println("-----Filter method-------");
    	list.stream().filter(e -> e.startsWith("K")).forEach(System.out::println);
    	
    	System.out.println("----Map method------");
    	list.stream().map(e -> e.toLowerCase()).filter(e -> e.startsWith("k")).distinct().forEach(System.out::println);
	
	}
	

}
