package Polymorphism;

public class OverRiding extends Adder {

	public int run(int x , int y) 
	{
		c=x+y;		
		return c;
	}
	
	public static void main(String[] args) {
		
		OverRiding a =new OverRiding();
		System.out.println(a.run(11, 5));		
	}
}