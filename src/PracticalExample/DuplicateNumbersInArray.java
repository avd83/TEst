package PracticalExample;

public class DuplicateNumbersInArray {

	public static void main(String[] args) {
		
		//to find duplicate numbers in array
		
		int[] a1= new int[] {1,2,1,3,5,1};
		int count;
		
		for(int i=0;i<a1.length;i++)
		{
			count=1;
			for(int j=i+1;j<a1.length;j++) 
			{
				if(a1[i]==a1[j])
				{
				count++;		
				}
			}
			if(count > 1 ) 			
			System.out.println(a1[i]+"count is :" +count);			
		}
	}
}
