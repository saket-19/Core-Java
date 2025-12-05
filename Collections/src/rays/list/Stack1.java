package rays.list;
import java.util.*;

public class Stack1 {
	public static void main(String[]args) {
		Stack s=new Stack();
		s.push("Saket");
		s.push("Singh");
		s.push("Parihar");
		s.push("Family");
		System.out.println(s);
		s.pop();
		System.out.println(s);
		System.out.println(s.peek());
		
	}

}
