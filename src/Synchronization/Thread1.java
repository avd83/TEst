package Synchronization;

import StaticSynchronization.Bank;

public class Thread1 extends Thread {
	
	 MethodSynchronization ms;		
	public Thread1(MethodSynchronization ms)
	{
		this.ms=ms;
	}
	
	public void run()
	{
		ms.TablePrint(7);
	}
}
