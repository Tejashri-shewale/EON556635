package iheritance;

class Room
{
	int length,breadth;
	Room(int a,int b)
	{
		length=a;
		breadth=b;
	
	}
	int area()
	{
		return(length*breadth);
		
	}
}


class BedRoom extends Room
{
	int height;
	
	BedRoom(int a,int b,int c)
	{
		super(a,b);
		height=c;
	}
	
	int vol()
	{
		return(length*breadth*height);
	}
}

public class SingleInheritance 
{

	public static void main(String[] args) 
	{
		BedRoom b=new BedRoom(12,12,32);
		int area1=b.area();
		int vol=b.vol();
		System.out.println("area--------  "+area1);
		System.out.println("volume--------  "+vol);
	}

}
