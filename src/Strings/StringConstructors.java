package Strings;

public class StringConstructors {

	public static void main(String[] args) {
		
		String str = new String();// blank parameter string constructor
		System.out.println(str.length());
		
		String str1 = new String("Abhay");// Literal parameter string constructor
		System.out.println(str1);
		
		StringBuffer sb = new StringBuffer("Apoorv");
		String str2 = new String(sb);//StringBuffer object can pass in string constructor
		System.out.println(str2);
		
		StringBuilder sbl = new StringBuilder("Mihika");
		String str3 = new String(sbl);//StringBuilder object can pass in string constructor
		System.out.println(str3);
		
		byte[] b = {101,102,103};
		String str4 = new String(b);//byte array object can pass in string constructor
		System.out.println(str4);
		
		char[] c = {'a','b','c'};
		System.out.println(c);
		String str5 = new String(c);//char array object can pass in string constructor
		System.out.println(str5);
		
		char[] c1 = new char[]{'a','b','c'};
		System.out.println(c1);
		
	}

}
