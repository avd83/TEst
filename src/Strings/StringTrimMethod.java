package Strings;

public class StringTrimMethod {

	public static void main(String[] args) {
		
		String str = new String("  Abhay  ");
		System.out.println(str);
		String name = str.trim();
		System.out.println(name);
		
		StringBuffer sb = new StringBuffer("    Abhay");
		String str1 = new String(sb);
		System.out.println(str1);
		String name1 = str1.trim();
		System.out.println(name1);
	}
}
