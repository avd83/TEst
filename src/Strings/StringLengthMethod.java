package Strings;

public class StringLengthMethod {

	public static void main(String[] args) {
		
		String name = "Abhay";
		
		if(name.length()>0)
		{
			System.out.println("String not empty");
		}
		else
		{
			System.out.println("String is empty");
		}
		
		String str = "";
		int i=str.length();
		
		if(i==0)
		{
			System.out.println("String is empty");
		}
		else
		{
			System.out.println("String not empty");
		}
		
		String str1 = null;
		try
		{
			int j=str1.length();
		
			if(j==0)
			{
			System.out.println("String is empty");
			}
				else
				{
					System.out.println("String not empty");
				}
		}
		catch(NullPointerException n)
		{
			System.out.println("NullPointerException handled");
		}
	}

}
