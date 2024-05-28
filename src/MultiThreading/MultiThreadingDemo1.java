package MultiThreading;

public class MultiThreadingDemo1 implements Runnable {
	public void run()
	{
		try
		{
		for(int i=1;i<5;i++)
		{
			System.out.println("Thread call by Runnable interface");
			Thread.sleep(1000);
		}
		}
		catch(Exception e)
		{
			System.out.println(e);
		}
	}
	public static void main(String[] args) throws InterruptedException {		
		MultiThreadingDemo1 r = new MultiThreadingDemo1();		
		Thread t = new Thread(r);
		t.start();		
		for(int i=1;i<5;i++)
		{
			System.out.println("Thread call by main Thread");
			Thread.sleep(1000);
		}
	}
}
