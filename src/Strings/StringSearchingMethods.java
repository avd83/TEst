package Strings;

public class StringSearchingMethods {

	public static void main(String[] args) {
	
		String s1 = "Abhay";
		
		System.out.println(s1.indexOf('h'));// return h index value
		System.out.println(s1.indexOf("ay"));// return h index value
		System.out.println(s1.lastIndexOf("a"));// return a index value
		System.out.println(s1.charAt(1));// return 1 index character value
		System.out.println(s1.contains("ha"));// return boolean value od string 
		System.out.println(s1.startsWith("a"));// return boolean  value
		System.out.println(s1.endsWith("ay"));// return boolean value
		
	}

}
