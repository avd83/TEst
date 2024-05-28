package MultiThreading;

public class PriorityMethod extends Thread {

	public void run()
	{
		System.out.println(Thread.currentThread().getName());
		System.out.println(Thread.currentThread().getPriority());
	}
	public static void main(String[] args) {
		
		PriorityMethod t1 = new PriorityMethod();
		PriorityMethod t2 = new PriorityMethod();
		PriorityMethod t3 = new PriorityMethod();
		
		t1.setName("Thread 1");
		t2.setName("Thread 2");
		t3.setName("Thread 3");
		
		t1.setPriority(7);
		t2.setPriority(10);
		t3.setPriority(2);
		
		t1.start();
		t2.start();
		t3.start();
	}

}
