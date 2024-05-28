package ExceptionHadling;

public class TryCatch {
	public static void main(String[] args) {
		
		int a=10;
		int b=0;
        int c = 0;
        
        try 
        {
        	 c=a/b;
        	 System.out.println(c);
        	 System.out.println("Inside the try block");
        }
        catch(ArithmeticException e)
        {
        	System.out.println("ArithmeticException: 0 can not be devide any value");
        	System.out.println(a/(b+2));
        }
		
		 System.out.println("outside the try and catch block");
	}
}
