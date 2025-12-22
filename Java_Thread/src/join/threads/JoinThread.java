package join.threads;

//The join() method makes one thread wait until another thread finishes its execution.

public class JoinThread extends Thread{
	public String name;
	
	public JoinThread(String name) {      
		this.name=name;
	}
	@Override
	public void run() {
		for(int i=1;i<=10;i++) {
			try {
				Thread.sleep(1000);     
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			System.out.println(i +" = " +name);
		}
	}
	
	

}
