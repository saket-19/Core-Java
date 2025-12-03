package rays.queue;
import java.util.*;

import java.util.Queue;

public class TestQueue {
	public static void main(String[]args) {
		Queue q=new ArrayDeque();
		for(char c ='a';c<='z';c++) {
			q.offer(c);
		}
		
		System.out.println(q);
		
	}

}
