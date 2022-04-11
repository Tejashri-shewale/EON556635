package java8;

interface Engine11
{
	abstract public void speed();
}
class Car1
{
	public void wheel()
	{
		System.out.println("Car has wheels of MRF company");
	}
}

 class ReferenceToInstanceMethod 
{

	public static void main(String[] args)
	{
		//using lambda expression 
				Engine11 obj=()->System.out.println("Speed is good");
			
				obj.speed();
				
				//Static method reference
				
				Car1 c=new Car1();
				Engine e2=c::wheel;
				
		
	}

}
