package rays.stream;
import java.util.*;
public class StreamOddEven {
	public static void main(String[]args) {
		ArrayList<Integer> l=new ArrayList<Integer>();
		for(int i=1;i<=10;i++) {
			l.add(i);
		}
		
		System.out.println("-----Odd numbers----");
		l.stream().filter(e -> e%2!=0).forEach(System.out::println);
		
		System.out.println("-----Even numbers----");
		l.stream().filter(e -> e%2==0).forEach(System.out::println);
	}

}
