package Strings;

public class StringConcateMethod {

	public static void main(String[] args) {
		
		String s1 = "Abhay";
		String s2 = "Dere";		
		System.out.println(s1+s2);
		System.out.println(s1+s2+10+20);////if int value in right then conacte the string first and then after no also concate with the same string
		System.out.println(10+20+s1+s2);//if int value in left then first addition happen between int value and then concate with string value
		System.out.println(10+s1+s2+20);//
		System.out.println(s1+s2+20/10);//return AbhayDere2
		System.out.println(20/10+s1+s2);
		System.out.println(2*10+s1+s2);
		System.out.println(s1+s2+2*10);
		//System.out.println(s1+s2+20-10);//return error		
		
		System.out.println(s1.concat(s2));
		
		String str = String.join(" ",s1, s2);//String class static method
		System.out.println(str);
	}
}