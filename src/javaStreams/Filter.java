package javaStreams;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public class Filter {
	public static void main(String[] args) 
	{
		getEvenNumbers();
		getStream();
	}	
	static void getEvenNumbers()
	{
		ArrayList<Integer> numbers = new ArrayList<Integer>();
		numbers.add(10);
		numbers.add(15);
		numbers.add(40);
		numbers.add(65);
		numbers.add(70);
		
		ArrayList<Integer> evenNumbers = new ArrayList<Integer>();
		for(int n : numbers)
		{
			if(n%2==0)			
			evenNumbers.add(n);
		}
		System.out.println(evenNumbers);
	}	
	static void getStream()
	{
		ArrayList<Integer> list = new ArrayList<Integer>();
		list.add(10);
		list.add(15);
		list.add(40);
		list.add(65);
		list.add(70);
		
		List<Integer> evenNumbersList = new ArrayList<Integer>();
		
		evenNumbersList = list.stream().filter(n->n%2==0).collect(Collectors.toList());
		System.out.println(evenNumbersList); // filter the data and store in collections and then print the same
		
		list.stream().filter(n->n%2==0).forEach(n->System.out.println(n)); // filter the data and without storing dircetly print the same.
		list.stream().filter(n->n%2==0).forEach(System.out::println); // filter the data and without storing dircetly print the same.
		
	}
}
