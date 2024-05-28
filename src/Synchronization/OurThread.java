package Synchronization;

public class OurThread extends Thread {	
	BlockSynchronization m;
	String name;
	OurThread(BlockSynchronization m, String name)
	{
		this.m=m;
		this.name=name;
	}
	public void run()
	{
		m.Show(name);
	}
}
