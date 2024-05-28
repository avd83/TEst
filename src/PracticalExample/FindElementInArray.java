package PracticalExample;

public class FindElementInArray {

	public static void main(String[] args) {
		
		//To find index of string in array.
		
		String str[]= { "ashish","apoorv","amol","abhay"};
		
		String str1="abhay";
		int isFind = 0 ;
		int index = 0;
		
		for(int i=0;i<str.length;i++)
		{
			if(str1.equals(str[i]))
			{
				isFind=1;	
				index=i;				
			}
		}			
				if(isFind==1)
				{
					System.out.println("String found at index"+" "+index);
				}
				else
				{
					System.out.println("String not found ");
				}
	}
}