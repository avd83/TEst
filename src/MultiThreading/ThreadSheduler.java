package MultiThreading;

public class ThreadSheduler extends Thread {	
	public void run()
	{
		String str = Thread.currentThread().getName();//get the thread name
		for(int i=1;i<4;i++)
		{
			System.out.println(str);
		}	
	}
	public static void main(String[] args) {		
		ThreadSheduler t = new ThreadSheduler();
		ThreadSheduler t1 = new ThreadSheduler();		
		t.setName("Thread 1");//set the thread name
		t1.setName("Thread 2");//set the thread name
		t.start();
		t1.start();			
		String str = Thread.currentThread().getName();
		for(int i=1;i<4;i++)
		{
			System.out.println(str);
		}
	}
}
