package staticKeyword;

public class StaticMethod {

	int i=5;
	static void show()
	{
		System.out.println("dircetly called by class name without creating objet of the class");
		//add();//can not access or call non static methods inside the static method.
	}
	
	void add()
	{
		System.out.println(10+20);
	}
	/*static void display()
	{
		System.out.println(this.i);// this pointer we can not use in static methods
	}*/
	
	public static void main(String[] args) {
		
		StaticMethod.show();//outside the class 
		show(); // within class we can access
		
		StaticMethod sm = new StaticMethod();
		sm.add();// for without static methods we can access using object class
		
		
		
	}

}
