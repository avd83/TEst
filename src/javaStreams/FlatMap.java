package javaStreams;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class FlatMap {

	// to convert multiple list into single collection as object by flatMap()
	public static void main(String[] args) {		
		
		List<Integer> list1 = Arrays.asList(1,2);
		List<Integer> list2 = Arrays.asList(3,4);
		List<Integer> list3 = Arrays.asList(5,6);
		
		List<List<Integer>>finallists = Arrays.asList(list1,list2,list3);
		System.out.println(finallists);
		
		List flatMapResult = finallists.stream().flatMap(f->f.stream()).collect(Collectors.toList());	
		List flatMapResult1 = finallists.stream().flatMap(f->f.stream().map(s->s+10)).collect(Collectors.toList());	
		List flatMapResult2 = finallists.stream().flatMap(f->f.stream().map(s->s+10).filter(l->l>12)).collect(Collectors.toList());
		
		System.out.println(flatMapResult);
		System.out.println(flatMapResult1);
		System.out.println(flatMapResult2);

	}

}
