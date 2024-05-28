package MultiThreading;

public class MultithreadingDemo extends Thread {	
	public void run()// thread class method for execute the code
	{
		try
			{
				for(int i=1;i<5;i++)
				{
					System.out.println("Apoorv in Thread1");
					Thread.sleep(1000);
				}
			}
		catch (Exception e)
			{
					System.out.println(e);
			}
	}
	public static void main(String[] args) throws InterruptedException {
		MultithreadingDemo t = new MultithreadingDemo();
		t.start();// thread command to call the thread method run for execute the code
		for (int i=1;i<5;i++)
		{
			System.out.println("Abhay main Thread");
			Thread.sleep(1000);
		}			
	}
}
