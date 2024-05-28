package MultiThreading;

public class IntrruptMethod extends Thread{

	public void run()
	{
		try
		{
			for(int i=1;i<4;i++)
			{
				System.out.println("Thread 1 is running");
				Thread.sleep(1000);
			}	
		}
		catch(Exception e)
		{
			System.out.println("Thread 1 terminated due to intrupt method");
		}		
	}
	public static void main(String[] args) {
		
		IntrruptMethod t = new IntrruptMethod();
		t.start();
		t.interrupt();// if any thread is in waiting or sleeping state or interrupt method call and thread get terminated		
	}

}
