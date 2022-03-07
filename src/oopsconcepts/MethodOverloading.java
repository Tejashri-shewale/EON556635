package oopsconcepts;

public class MethodOverloading
{
	
	public void area(int side) 
	{
		int res=side*side;
		System.out.println("\n area of square--- "+res);
	}
	
	public void area(int length,int breadth) 
	{
		int res=length*breadth;
		System.out.println("\n area of rectangle--- "+res);
	}
	public void area(double pi,int r) 
	{
		double res=pi*r*r;
		System.out.println("\n area of circle--- "+res);
	}

	public static void main(String[] args)
	{
		MethodOverloading m=new MethodOverloading();
		m.area(10);
		m.area(20, 30);
		m.area(3.14, 6);

	}

}
