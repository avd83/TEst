package MultiThreading;

public class JoinMethod extends Thread {
	public void run()
	{
		String str = Thread.currentThread().getName();//get the thread name
		for(int i=1;i<4;i++)
		{
			System.out.println(str);
		}	
	}

	public static void main(String[] args) {
		JoinMethod t = new JoinMethod();
		JoinMethod t1 = new JoinMethod();		
		t.setName("Thread 1");//set the thread name
		t1.setName("Thread 2");//set the thread name
		
		t1.start();
		try
		{
			t1.join();//execute this thread first instead of main and other threads
		}
		catch (Exception e)
		{
			System.out.println(e);
		}
		t.start();
		
		String str = Thread.currentThread().getName();
		for(int i=1;i<4;i++)
		{
			System.out.println(str);
		}

	}

}
