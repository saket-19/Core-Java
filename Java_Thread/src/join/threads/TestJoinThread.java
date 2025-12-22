package join.threads;
//The join() method makes one thread wait until another thread finishes its execution.
public class TestJoinThread {
	public static void main(String[]args) {
		JoinThread t1=new JoinThread("Ram");
		JoinThread t2=new JoinThread("Shyam");
		
		t1.start();
		try {
			t1.join();
		} catch (InterruptedException e) {
			
			e.printStackTrace();
		}
		t2.start();
		
		for(int i=1;i<=10;i++) {
			System.out.println(i+"akbar");    //main thread
		}
		
	}

}
