package ExceptionHadling;

public class TryVsThrowVsThrowsException {
		
	public static void vote(int age) throws Exception
	{
		if(age<18)
		{
			throw new Exception("voting not allowed");
		}
		else
		{
			System.out.println("Eligible for voting");
		}
	}
	public static void main(String[] args) {
		
		try
		{
			vote(0);
		}
		catch(Exception e)
		{
			System.out.println(e);
		}
		System.out.println("rest method ended");
	}
}