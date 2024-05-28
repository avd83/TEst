package javaStreams;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class NonTerminalStreams {

	//terminal streams methods 
	public static void main(String[] args) {

		List<String> list1 = Arrays.asList("car","bus","truck","scooetr","car","bus");
		
		
		list1.stream().distinct().forEach(System.out::println);
		
		List<String>distinctList = list1.stream().distinct().collect(Collectors.toList());
		System.out.println(distinctList);
		
		 long count = list1.stream().distinct().count();		 
		 System.out.println(count);
		 
		 List<String> limits = list1.stream().distinct().limit(2).collect(Collectors.toList());
		 System.out.println(limits);
		
		
	}

}
