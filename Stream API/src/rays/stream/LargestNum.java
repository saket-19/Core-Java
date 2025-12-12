package rays.stream;
import java.util.*;

public class LargestNum {
	public static void main(String[]args) {
		
		ArrayList<Integer> l=new ArrayList<Integer>();
		l.add(40000);
		l.add(600000);
		l.add(50000);
		l.add(40000);
		
		l.stream().max(Integer::compare).ifPresent(System.out::println);
	}

}
