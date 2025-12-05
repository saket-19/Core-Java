package rays.queue;
import java.util.*;

public class QueueTransfer {
	public static void main(String[]args) {
		
		Queue q1=new ArrayDeque();
		for(char c='a';c<='z';c++) {
			q1.offer(c);
		}
		Queue q2 =new ArrayDeque();
		while(!q1.isEmpty()) {
			char element =(char) q1.poll();
			q2.offer(element);
		}
		System.out.println("Queue q1: " + q1);  // should be empty
        System.out.println("Queue q2: " + q2);  // contains a to z
	}
	
    
}
