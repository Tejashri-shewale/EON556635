package java8;

interface Engine
{
	public static void display()
	{
		System.out.println(" Static Method ");
	}

	public void speed();

	
}

public class StaticMethodEx 
{

	public static void main(String[] args) 
	{
		Engine.display();
		
	}

}
