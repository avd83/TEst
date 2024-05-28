package Strings;

public class StringCompareToMethod {

	public static void main(String[] args) {
		
		//if print 0 : s1=s2
		//   print + : s1>s2
		//   print - : s1<s2
		//comareTo method compare 2 string in lexicographically
		
		String s5 ="a";//this will return decimal 97 value
		String s6 = "a"; //this will return decimal 65 value		
		System.out.println(s5.compareTo(s6));// this line will return 97-97= 0 so s5=s6
		
		String s1 ="a";//this will return 97 value
		String s2 = "A"; //this will return 65 value		
		System.out.println(s1.compareTo(s2));// this line will return 97-65= 32 so s1>s2

		String s3 ="A";//this will return 65 value
		String s4 = "a"; //this will return 97 value		
		System.out.println(s3.compareTo(s4));// this line will return 65-97= -32 so s3<s4
		
		

	}

}
