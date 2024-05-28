package javaStreams;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class Map1 {

	//convert Lower case to Upper case
	public static void main(String[] args) {		
		oldMethods();
		streamMap();
	}
	
	static void oldMethods()
	{
		List<String> vehicle = Arrays.asList("car","scooter","Bike","Truck");		
		ArrayList<String> namesVehicle = new ArrayList<String>();
				
		for(String names:vehicle)
		{
			namesVehicle.add(names.toUpperCase());
		}		
		System.out.println(namesVehicle);
	}
	
	static void streamMap()
	{
		List<String> vehicle = Arrays.asList("car","scooter","Bike","Truck");		
		List<String> namesVehicle = new ArrayList<String>();
	
		namesVehicle = vehicle.stream().map(v->v.toUpperCase()).collect(Collectors.toList());	
		System.out.println(namesVehicle);
	}

}
