package TypeCasting;

public class TypeCasting {

	public static void main(String[] args) {
		
		int a=8;
		double b = a;//Implicit type casting//automatic
		
		double c=10.7;
		int d = (int) c;//explicit type casting //Manually
		
		System.out.println("Implicite casting:"+b+"");
		System.out.println("Explicite casting:"+d+"");

	}

}
