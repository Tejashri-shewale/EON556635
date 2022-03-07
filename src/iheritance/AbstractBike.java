package iheritance;

abstract class Bike
{
	abstract void run();
}

public class AbstractBike extends Bike
{

	public static void main(String[] args)
	{
		AbstractBike a=new AbstractBike();
		a.run();

	}

	@Override
	void run() 
	{
		System.out.println("\n --- running abstract method --- ");
	}

}
