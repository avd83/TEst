package PracticalExample;

public class CountElementInArray {

	public static void main(String[] args) {
		
		//count element in array
		
		String str[]= { "a","b","c","d"};
		int count = 0 ;
		
		for(int i=0;i<str.length;i++) 
		{
			count++;
		}
		System.out.println("The count of element in the array are : " + count);
	}
}
