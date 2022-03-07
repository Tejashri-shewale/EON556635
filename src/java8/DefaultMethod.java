package java8;


interface Test
{
	public void square(int a);
	default void show()
	{
		System.out.println(" Default Method ");
	}
	
}

public class DefaultMethod implements Test
{

	public void square(int a)
	{
		System.out.println(a*a);
	}
	public static void main(String[] args)
	{
		
		DefaultMethod d= new DefaultMethod();
		d.square(4);
		d.show();
		

	}

}
