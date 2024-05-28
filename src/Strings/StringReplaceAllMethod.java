package Strings;

public class StringReplaceAllMethod {

	public static void main(String[] args) {
		
		String s1 = "This is Tester";
		
		System.out.println(s1.replaceAll("is", "was"));// Thwas was Tester
		
		System.out.println(s1.replaceAll("is(.)", "was"));// ThwaswasTester
		
		System.out.println(s1.replaceAll("is(.*)", "was"));// Thwas		
	}
}
