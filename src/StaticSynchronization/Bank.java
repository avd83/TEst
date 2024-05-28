package StaticSynchronization;

public class Bank extends Thread {
	static int bal=5000;
	static int withdraw;	
	Bank(int withdraw)
	{
		this.withdraw=withdraw;
	}		
	public static synchronized void Withdraw()
	{
		String name = Thread.currentThread().getName();		
		if(withdraw<=bal)
		{
			System.out.println("Withdraodow money");
			bal=bal-withdraw;
		}
		else
		{
			System.out.println("insufficient balance");
		}
	}	
	public void run()
	{
		Withdraw();
	}
}
