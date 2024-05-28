package Strings;

public class StringJoinMethod {

	public static void main(String[] args) {
		
		//join method should call from String class because it is static method
		
		String s1 = "Abhay";
		String s2 = "Dere";		
		
		System.out.println(String.join("",s1,s2));
		System.out.println(String.join("  ",s1,s2));
		System.out.println(String.join(",",s1,s2));
		System.out.println(String.join(";",s1,s2));
	}

}
