package ExceptionHadling;

public class ThrowException {

	void checkNum(int num)
	{
		if (num < 1) 
		{  
	          throw new ArithmeticException("\nNumber is negative, cannot calculate square");  
			
	     }  
	     else
	     {  
	            System.out.println("Square of " + num + " is " + (num*num));  
	        }  
	}
	public static void main(String[] args) {
		
		ThrowException te = new ThrowException();
		te.checkNum(0);
	}

}
