package Polymorphism;

public class Adder {
	
	static int c;
	 static int add(int a, int b)
	{
		c=a+b;
		return c  ;
	}
	 
	 static int add(int a, int b,int d)
	 {		 
		 c=a+b+d;
		 return c;
	 }

	 static double add(double a, int b)
		{
			double  c;
			c =(int)a+b;//type casting
			return c  ;
		}
	 
	  public int run(int a, int b)
		{		  
		  c=a+b;
		  return c;			
		}	 
}