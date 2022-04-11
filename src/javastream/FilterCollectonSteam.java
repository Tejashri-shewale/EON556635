package javastream;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

class Product
{
	int id;
	String name;
	float price;
	
	public Product(int id,String name,float price)
	{
		this.id=id;
		this.name=name;
		this.price=price;
		
	}
}
public class FilterCollectonSteam 
{

	public static void main(String[] args) 
	{
		List<Product> p= new ArrayList<Product>();
		p.add(new Product(1,"laptop",20000f));
		p.add(new Product(2,"mobile",30000f));
		p.add(new Product(3,"webcam",10000f));
		p.add(new Product(4,"tab",50000f));
		
		List<Float> p2=p.stream().filter(s->s.price>10000f).map(s->s.price).collect(Collectors.toList());
		System.out.println(p2);
	}

}
