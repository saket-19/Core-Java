package daemon.thread;

public class TestBackgroundThread {
	public static void main(String[] args) {
		BackgroundThread t1=new BackgroundThread("deamon thread");
		t1.setDaemon(true);
		t1.start();
		
		for(int i=1;i<=40;i++) {
			try {
				Thread.sleep(100);
			} catch (InterruptedException e) {
				
				e.printStackTrace();
			}
			System.out.println(i+" main");
		}
	}
	

}
