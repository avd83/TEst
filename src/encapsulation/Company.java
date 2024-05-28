package encapsulation;

public class Company {
	public static void main(String[] args) {
		
		Employee e = new Employee();
		
		e.setEmpId(9002);
		System.out.println(e.getEmpId());
	}
}
