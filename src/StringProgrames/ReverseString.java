package StringProgrames;

public class ReverseString {

	public static void main(String[] args) {
				
		String s1 = "abhay";
		System.out.println(s1.length());
			
		String reverse="";
		
		for(int j=s1.length()-1;j>=0;j--)
		{
			reverse = reverse +s1.charAt(j);
			
		}		
		System.out.println(reverse);
	}

}
