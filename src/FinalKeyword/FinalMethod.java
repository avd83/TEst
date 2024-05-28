package FinalKeyword;

public class FinalMethod extends Parent {
	
	
	 void Test1()
	{
		System.out.println("I am not Final method:child");
	}
	//void Test()
	//	{
	//		System.out.println("I am not Final method: parent");
		//}

 public static void main(String[] args) {
		
		FinalMethod f = new FinalMethod();
		f.Test1();
		f.Test();
	}

}
