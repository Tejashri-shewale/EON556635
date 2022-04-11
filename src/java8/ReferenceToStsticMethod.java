package java8;


interface Engin
{
	abstract public void speed();
}
class Car
{
	public static void average()
	{
		System.out.println("\n The average of car is very good ");
	}
}
public class ReferenceToStsticMethod 
{

	public static void main(String[] args) 
	{
		//using lambda expression 
		Engine obj=()->System.out.println("Speed is good");
	
		obj.speed();
		
		//Static method reference
		
		Engine e1=Car::average;
		e1.speed();
	}

}
