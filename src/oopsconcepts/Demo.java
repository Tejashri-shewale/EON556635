package oopsconcepts;

public class Demo<a> {

	public static void add(int r)
	{
		int area=r*r;
	System.out.println(" area of square ---- "+area);
	}
	
	
	public int add1(int a,int b)
	{
		int y=a+b;
		return y;
	}
	
	
	public static void main(String[] args) 
	{
		Demo d=new Demo();
		Demo.add(5);
		System.out.println("Addition ----"+d.add1(10,20));
	}

}
