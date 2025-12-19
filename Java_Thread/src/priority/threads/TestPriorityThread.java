package priority.threads;

public class TestPriorityThread {
	public static void main(String[] args) {
		PriorityThread t1=new PriorityThread("ram");
		PriorityThread t2=new PriorityThread("shyam");
		
		t1.setPriority(Thread.MAX_PRIORITY); // 10 maximum priority
        t2.setPriority(Thread.MIN_PRIORITY); //1 minimum priority
        
        t1.start();
		t2.start();
	}

}
