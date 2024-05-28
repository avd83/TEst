package javaStreams;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class Map3 {

	public static void main(String[] args) {
		oldWay();
		newWay();
	}
	static void oldWay()
	{
		List<Integer> numbers = Arrays.asList(2,4,6,8);	
		ArrayList<Integer> multiplicationNumbers = new ArrayList<Integer>();		
		for(int num :numbers)
		{
			multiplicationNumbers.add(num*3);
		}
		System.out.println(multiplicationNumbers);
	}
	static void newWay()
	{
		ArrayList<Integer> numbers = new ArrayList<Integer>();
		numbers.add(2);
		numbers.add(4);
		numbers.add(6);
		ArrayList<Integer> multiplicationNumbers = new ArrayList<Integer>();
		multiplicationNumbers = (ArrayList<Integer>) numbers.stream().map(m->m*3).collect(Collectors.toList());
		System.out.println(multiplicationNumbers);
		
	}
}
