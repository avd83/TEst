package Strings;

public class StringCaseAndTypeConversionMethods {

	public static void main(String[] args) {
		
		//Case conversion of the string
		String s = "Abhay";		
		System.out.println(s.toUpperCase());
		System.out.println(s.toLowerCase());
		
		
		//Type Conversion of the String
		 int i = 10;
		 char[] c2={'a','b'};
		String str = String.valueOf(i);
		System.out.println(str);
		String str2 = String.valueOf(c2);
		System.out.println(str2);
		
		
		char[] c = s.toCharArray();
		System.out.println(c);		
	}

}
