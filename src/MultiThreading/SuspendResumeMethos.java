package MultiThreading;

public class SuspendResumeMethos extends Thread {
	public void run()
	{
		String str = Thread.currentThread().getName();//get the thread name
		for(int i=1;i<4;i++)
		{
			System.out.println(str);
		}	
	}

	public static void main(String[] args) {
		SuspendResumeMethos t = new SuspendResumeMethos();
		SuspendResumeMethos t1 = new SuspendResumeMethos();		
		t.setName("Thread 1");//set the thread name
		t1.setName("Thread 2");//set the thread name
		
		t1.start();
		try
		{
			t1.suspend();;// suspend this method and execute other threads 
		}
		catch (Exception e)
		{
			System.out.println(e);
		}
		t.start();
		t1.resume();///resume suspended threads after execute others all threads
	}

}
