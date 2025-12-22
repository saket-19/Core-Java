package racing.threads;

import RacingProblemSyncronised.Account1;

public class Racing extends Thread{
	String name=null;
	
	public static Account1 account=new Account1();
	
	public Racing(String name) {
		this.name=name;
	}
	@Override
	public void run() {
		for(int i=1;i<=5;i++) {
			account.deposit(name, 1000);
		}
	}
	

}
