package PracticalExample;

import java.util.Arrays;

public class CompareTwoStringArray {

	public static void main(String[] args) {
		
		//to compare 2 array
	
		int[] a1= new int[] {1,2,4,3,5};
		
		int[] a2= new int[] {5,2,3,1,4};
		
		Arrays.sort(a1);
		Arrays.sort(a2);
		
		if (Arrays.equals(a1, a2))
		{
			System.out.println("both array are same");
		}
		else
		{
			System.out.println("both array are not same");
		}		
	}
}