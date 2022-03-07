package java8;

interface Engine
{
	public static void display()
	{
		System.out.println(" Static Method ");
	}
}

public class StaticMethodEx 
{

	public static void main(String[] args) 
	{
		Engine.display();
		
	}

}
