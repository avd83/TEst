package javaStreams;

import java.util.ArrayList;
import java.util.stream.Collectors;

public class FilerAndMap {

	public static void main(String[] args) {
		
		newWay();
	}
	static void newWay()
	{
		ArrayList<Integer> numbers = new ArrayList<Integer>();
		numbers.add(2);
		numbers.add(3);
		numbers.add(4);
		numbers.add(6);
		ArrayList<Integer> multiplicationNumbers = new ArrayList<Integer>();
		multiplicationNumbers = (ArrayList<Integer>) numbers.stream().map(m->m*3).filter(n->n>10).collect(Collectors.toList());
		System.out.println(multiplicationNumbers);
		
	}

}
