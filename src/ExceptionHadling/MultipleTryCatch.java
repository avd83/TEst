package ExceptionHadling;

public class MultipleTryCatch {

	public static void main(String[] args) {
		int a=10;
		int b=2;
        int c = 0;
        String str= null;
        
        try 
        {
        	 c=a/b;
        	 System.out.println(c);        	 
        	 System.out.println(str.toUpperCase());
        	 
        	 System.out.println("Inside the try block");
        }
        catch(ArithmeticException e)
        {
        	System.out.println("ArithmeticException: 0 can not be devide any value");
        	System.out.println(a/(b+2));
        }
        catch(NullPointerException e)
        {
        	System.out.println("null can not be casted");
        	System.out.println(a/(b+2));
        }
		 System.out.println("outside the try and catch block");
	}

	}


