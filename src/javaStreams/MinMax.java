package javaStreams;

import java.util.Arrays;
import java.util.List;
import java.util.Optional;

public class MinMax {

	public static void main(String[] args) {
		
		List<Integer> nuberList= Arrays.asList(1,2,3,4,5,6,7,8);
		
		long count = nuberList.stream().filter(n->n%2==0).count();
		System.out.println(count);
		
		Optional op = nuberList.stream().min((value1,value2)->{ return value1.compareTo(value2);});
		System.out.println(op);
		
		Optional op1 = nuberList.stream().max((value1,value2)->{ return value1.compareTo(value2);});
		System.out.println(op1);
				
	}

}
