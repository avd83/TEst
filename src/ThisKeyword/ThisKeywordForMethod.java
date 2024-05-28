package ThisKeyword;

public class ThisKeywordForMethod {
	
	void display()
	{
		System.out.println("hi");
	}
	
	void display1()
	{
		this.display();
		System.out.println("hello");
	}	

	public static void main(String[] args) {

		ThisKeywordForMethod tk = new ThisKeywordForMethod();
		tk.display1();		

	}
}
