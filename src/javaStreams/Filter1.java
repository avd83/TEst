package javaStreams;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class Filter1 {

	public static void main(String[] args) {
		
		
		List<String> names= Arrays.asList("Abhay","Abijeet","Amol","Ashish");
		
		List<String> names1= Arrays.asList();
		
		names.stream().filter(s->s.startsWith("Ab")).forEach(System.out::println);
		
		names1 = names.stream().filter(s->s.length()>5).collect(Collectors.toList());
		System.out.println(names1);

	}

}
