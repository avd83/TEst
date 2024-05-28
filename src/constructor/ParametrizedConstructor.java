package constructor;

public class ParametrizedConstructor {
	
	String name;
	int empId;
	ParametrizedConstructor(String name,Integer empId)
	{
		System.out.println("Parametrized Constructor");
		this.name=name;
		this.empId=empId;		
	}

	public static void main(String[] args) {
		
		ParametrizedConstructor pc = new ParametrizedConstructor("abhay",9002);
		ParametrizedConstructor pc1 = new ParametrizedConstructor("apoorv",6245);
		System.out.println(pc.name+" "+pc.empId);
		System.out.println(pc1.name+" "+pc1.empId);

	}
}
