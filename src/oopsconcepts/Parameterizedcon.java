package oopsconcepts;
class Cube
{
	int len;
	int breadth;
	int height;
	public int getVol()
	{
		return(len*breadth*height);
	}
	
	Cube()
	{
		len=10;
		breadth=10;
		height=10;
	}
	Cube(int l,int b,int h)
	{
		len=l;
		breadth=b;
		height=h;
	}
}

public class Parameterizedcon 
{

	public static void main(String[] args) 
	{
		Cube c,c2;
		c=new Cube();
		c2=new Cube(10,20,30);
		System.out.println("volume of c---"+c.getVol());
		System.out.println("volume of c---"+c2.getVol());

	}

}
