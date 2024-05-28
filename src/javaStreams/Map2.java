package javaStreams;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Map2 {
	
	//to find the length of each word and rint in the console

	public static void main(String[] args) {
	
		oldWay();
		newWay();		
	}	
	static void oldWay()
	{
		System.out.println("Using old java===================================");
		List<String> vehicle = Arrays.asList("car","scooter","Bike","Truck");	
		
		ArrayList<String> namesVehicle = new ArrayList<String>();
		
		for(int i=0;i<vehicle.size();i++)			
		{
			System.out.println(vehicle.get(i).length());			
		}
	}
	static void newWay()
	{
		System.out.println("Using Stream===================================");
		List<String> vehicle = Arrays.asList("car","scooter","Bike","Truck");
		
		vehicle.stream().map(l->l.length()).forEach(System.out::println);
	}
}
