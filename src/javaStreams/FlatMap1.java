package javaStreams;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class FlatMap1 {

	public static void main(String[] args) {
		
		oldWay();
		newWay();		
	}	
	static void oldWay()
	{
		List<String> list1 = Arrays.asList("rohit","jaiswal");
		List<String> list2 = Arrays.asList("virat","surya");
		List<String> list3 = Arrays.asList("bumrah","siraj");
		
		ArrayList<List<String>> wcTeam = new ArrayList<List<String>>();
		wcTeam.add(list1);
		wcTeam.add(list2);
		wcTeam.add(list3);
		//System.out.println(wcTeam);
		
		for(List<String> team:wcTeam)
		{
			for( String name : team)
			{	
			System.out.println(name);
			}
		}			
	}
	static void newWay()
	{
		List<String> list1 = Arrays.asList("rohit","jaiswal");
		List<String> list2 = Arrays.asList("virat","surya");
		List<String> list3 = Arrays.asList("bumrah","siraj");
		
		ArrayList<List<String>> wcTeam = new ArrayList<List<String>>();
		wcTeam.add(list1);
		wcTeam.add(list2);
		wcTeam.add(list3);
		//System.out.println(wcTeam);
		
		List<String> finalList = wcTeam.stream().flatMap(list->list.stream()).collect(Collectors.toList());	
		System.out.println(finalList);
		
	}
	
}
