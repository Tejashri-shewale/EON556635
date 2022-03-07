package oopsconcepts;


class Animal
{
	public void move()
	{
		System.out.println("Animal can move");
	}
}
class Dog extends Animal
{
	public void move()
	{
		super.move();//super class method
		System.out.println(" dog can walk and run ");
	}
}
public class MethodOverriding 
{

	public static void main(String[] args) 
	{
		Dog d=new Dog();
		d.move();//sub class method
	}

}
