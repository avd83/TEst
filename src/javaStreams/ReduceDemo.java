package javaStreams;

import java.util.Arrays;
import java.util.List;
import java.util.Optional;

public class ReduceDemo {

	public static void main(String[] args) {		
		
		List<Integer> nuberList= Arrays.asList(1,2,3,4,5,6,7,8);		
		Optional<Integer> list2=nuberList.stream().reduce((value, combinedvalue)->
														{
															return combinedvalue+value;
														});
		System.out.println(list2.get());

	}

}
