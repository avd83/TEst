package staticKeyword;

public class StaticVariable {
	
	static int i=10; // declare always static variable on class level

	//void display()
	//{
	//	static int x=20; // we can not declare the static keyword for local variables. if declared it shows error
	//}
	public static void main(String[] args) {
		
		System.out.println(i);
		System.out.println(Test.y);// static variables can call through direct class name .
		
		Test t= new Test();
		System.out.println(t.x); // normal variables can through create class object 
	}

}
