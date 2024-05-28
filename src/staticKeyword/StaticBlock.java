package staticKeyword;

public class StaticBlock {
	
	StaticBlock()
	{
		System.out.println("i am constructor");
	}
	static// this block will execute if main class is available and it is execute first
	{
		System.out.println("i am top static block : Hello");
	}
	
public static void main(String[] args) {		
		
	StaticBlock s = new StaticBlock();
	System.out.println("i a in main block : Hello");
	}

static// this block will execute if main class is available and it is execute first
{
	System.out.println("i am at end static block : Hello");
}

}
