package SuperKeyword;

public class Child extends Parent {
	
	int a=20;
	
	Child()
	{
		super(); // calling parent class constructor using Super keyword
		System.out.println("This is Child class Constructor");
	}
	
	void show(int a)
	{
		System.out.println("This is Parent class instance variable value : "+ super.a);
		System.out.println("This is Current class instance variable value : "+this.a);
		System.out.println("This is Current  class local variable value : "+ a);
	}
	
	void display1()
	{
		super.display(); // calling method from parent class using Super keyword
		System.out.println("This is Child class Method ");
	}
	
	public static void main(String[] args) {
		
		Child c = new Child();
		c.show(30);
		c.display1();		
	}
}