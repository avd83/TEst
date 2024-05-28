package Strings;

public class StringEqualsMethod {

	public static void main(String[] args) {
		
		String s1 = "Abhay";
		String s2 = "Abhay";
		System.out.println(s1.equals(s2));//return boolean value
		
		String s3 = "ABHAY";
		String s4 = "Abhay";
		System.out.println(s3.equals(s4));//case sensitive
		
		String s5 = "Apoorv";
		System.out.println(s5.equals(""));//is empty or not string using this method
	}
}
