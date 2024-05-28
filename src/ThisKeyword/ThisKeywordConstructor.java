package ThisKeyword;

public class ThisKeywordConstructor {
	
	ThisKeywordConstructor()
	{	
		
		System.out.println("Without argument");
				
	}
	
	ThisKeywordConstructor(int x)
	{	
		this();
		System.out.println("With argument");
		
	}

	public static void main(String[] args) {
		
		ThisKeywordConstructor tk = new ThisKeywordConstructor(2);
		
	}

}
