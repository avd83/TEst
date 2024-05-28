package staticKeyword;

public class StaticVariable1 {
	
	static String company="Laminaar";
	int empid;
	String name;
	
	StaticVariable1(int empid,String name)
	{
		//this.company=company;
		this.empid=empid;
		this.name=name;
	}
	
	void display()
	{
		System.out.println(company + empid + name);
	}
	
	public static void main(String[] args) {
		
		StaticVariable1 sv = new StaticVariable1(9002,"abhay");
		StaticVariable1 sv1 = new StaticVariable1(9092,"dibyendu");
		sv.display();
		sv1.display();
	}

}
