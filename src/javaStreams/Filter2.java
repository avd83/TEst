package javaStreams;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

class Product
{
	int id;
	String name;
	double price;
	
	Product (int id,String name,double price)
	{
		this.id=id;
		this.name=name;
		this.price=price;
	}	
}
public class Filter2 {	

	public static void main(String[] args) {
		
		ArrayList<Product>product=new ArrayList<Product>();
		
		
		product.add(new Product(1,"del laptp",23000));
		product.add(new Product(1,"lenovo laptp",27000));
		product.add(new Product(1,"hp laptp",29000));
		
		product.stream().filter(p->p.price>27000).forEach(pr->System.out.println(pr.price));//to filter the price data from the strams.
		
	}

}
