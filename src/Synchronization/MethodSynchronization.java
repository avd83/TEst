package Synchronization;

public class MethodSynchronization {	
	public synchronized void TablePrint(int n)
	{		
		for(int i=1;i<=10;i++)
		{
				System.out.println(n*i);
		}
	}	
public static void main(String[] args) {	
	MethodSynchronization m = new MethodSynchronization();
		Thread1 t1= new Thread1(m);
		Thread2 t2= new Thread2(m);
		
		t1.start();
		t2.start();
	}
}
