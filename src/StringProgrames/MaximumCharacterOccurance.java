package StringProgrames;

public class MaximumCharacterOccurance {

	public static void main(String[] args) {
		
		String s1 = "abhay";		
		int arr[]=new int[127];//for replacing the character in string as ascii value 
		 
		for(int i=0;i<s1.length();i++)
		{
			arr[s1.charAt(i)]= arr[s1.charAt(i)]+1;
		}
		int max=0;
		char c= ' ';
		
		for(int i=0;i<s1.length();i++)
		{
			if(max<arr[s1.charAt(i)])
			{
				max=arr[s1.charAt(i)];
				c=s1.charAt(i);
			}
		}
		System.out.println("maximum repeated character is : "+ c);
		
		
	}
}
