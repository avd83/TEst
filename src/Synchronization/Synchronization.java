package Synchronization;

public class Synchronization implements Runnable {
	int avialable =1;
	int passenger;
	Synchronization(int passenger)
	{
		this.passenger = passenger;
	}
	public synchronized void run()//using this synchronization thread will reserve 1 seat out of 3 thread 
	{		
		String name = Thread.currentThread().getName();
		if(avialable>=passenger)
		{
			System.out.println(name+" reserved seat");
			avialable = avialable-passenger;
		}
		else
		{
			System.out.println(name+"seat not reserved");
		}
	}
	public static void main(String[] args) {
		Synchronization r = new Synchronization(1);		
		Thread t1 = new Thread(r);
		Thread t2 = new Thread(r);
		Thread t3 = new Thread(r);		
		t1.setName("abhay");
		t2.setName("Apoorv");
		t3.setName("pallavi");
		t1.start();
		t2.start();
		t3.start();
	}

}
