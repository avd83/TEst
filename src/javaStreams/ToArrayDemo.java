package javaStreams;

import java.util.Arrays;
import java.util.List;

public class ToArrayDemo {

	public static void main(String[] args) {		
		 
		List<Integer> list= Arrays.asList(1,2,3,4,5,6,7,8);		
			Object arr[] = list.stream().toArray();
			
			for(Object o : arr)
			{
				System.out.println(o);
			}
	}
}
