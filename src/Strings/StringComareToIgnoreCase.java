package Strings;

public class StringComareToIgnoreCase {

	public static void main(String[] args) {
		
		String s1 ="a";//this will return 97 value
		String s2 = "A"; //this will return 65 value		
		System.out.println(s1.compareToIgnoreCase(s2));// this line will return same value and always show the result 0 ;
	}
}