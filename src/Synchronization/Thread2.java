package Synchronization;

import StaticSynchronization.Bank;

public class Thread2 extends Thread {
MethodSynchronization ms;		
public Thread2(MethodSynchronization ms)
{
	this.ms=ms;
}

public void run()
{
	ms.TablePrint(5);
}
}