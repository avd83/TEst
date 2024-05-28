package ExceptionHadling;

public class TryCatchVsThrowsException {

	
	 public static void test() throws InterruptedException
	{
		for(int i=1;i<=5;i++)
		{
			System.out.println(i);
			Thread.sleep(2000);
		}
	}
	public static void main(String[] args) {
		try
		{
			test();
			System.out.println(10/0);
		}
		catch(Exception e)
		{		
			System.out.println("Exception Handled");
		}
		System.out.println("main method ended");
	}

}
