package Synchronization;

public class BlockSynchronization {
	public void Show(String name)
	{	
		;;;;;;;///100line of code
		synchronized (this)
		{
				for(int i=1;i<=3;i++)
			{
				System.out.println("How are yoy" +name);
			}
		}
		;;;;;///100 line of code
	}	

	public static void main(String[] args) {		
		BlockSynchronization m=new BlockSynchronization();		
		OurThread t1=new OurThread(m,"abahy");
		OurThread t2=new OurThread(m,"apoorv");
		
		t1.start();
		t2.start();
	}
}
