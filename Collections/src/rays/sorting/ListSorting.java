package rays.sorting;
import java.util.*;

public class ListSorting {
	public static void main(String[]args) {
		ArrayList list=new ArrayList();
		list.add('d');
		list.add('c');
		list.add('a');
		list.add('b');
		
		Collections.sort(list);  //sorts the elements in an order
		System.out.println(list);
		Collections.shuffle(list);  //shuffle the elements in random order
		System.out.println(list);
		
		
	
	}

}
