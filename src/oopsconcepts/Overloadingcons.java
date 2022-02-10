package oopsconcepts;

class Room
{
	float len;
	float breadth;
	Room(float x,float y)
	{
		len=x;
		breadth=y;
		
	}
	Room(float x)
	{
		len=breadth=x;
	}
	
	float area()
	{
		return (len*breadth);
	}
}
public class Overloadingcons 
{

	public static void main(String[] args) 
	{
		Room r1,r2;
		r1=new Room(12.2f,13.2f);
		r2=new Room(31.3f);
		r1.area();
		System.out.println(" area---- "+r1.area());
	}

}
