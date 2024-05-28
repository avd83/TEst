package StringBufferMethods;

public class StringBufferReverseMethods {

	public static void main(String[] args) {
		
		
		StringBuffer sb = new StringBuffer("Abhay VijayKumar Dere");
		
		System.out.println(sb.reverse());
		
		System.out.println(sb.subSequence(5, 15));
		System.out.println(sb.substring(5));
	}

}
