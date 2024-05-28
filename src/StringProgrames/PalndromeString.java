package StringProgrames;

public class PalndromeString {

	public static void main(String[] args) {

		String s1 = "Nitin";		
		String rev="";
		
		for(int i=s1.length()-1;i>=0;i--)
		{
			rev=rev+s1.charAt(i);
		}
		System.out.println(rev);
		
		if(s1.equalsIgnoreCase(rev))
		{
			System.out.println(s1+ " : is a palndome string");
		}
		else 
		{
			System.out.println(s1+ " : is not a palndome string");
		}
	}

}
