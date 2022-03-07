package iheritance;

interface Area
{
	final static float pi=3.14f;
	float compute(float x,float y);
}
class Rectangle implements Area
{
	public float compute(float x,float y)
	{
		return(x*y);
	}
}
class Circle implements Area
{
	public float compute(float x,float y)
	{
		return(pi*x*y);
	}
}
public class InterfaceTest {

	public static void main(String[] args) {
		Rectangle r=new Rectangle();
		Circle c=new Circle();
		Area a;
		a=r;
		System.out.println(" \n area of rectangle is--- "+a.compute(10.0f, 20.0f));
		a.compute(0, 0);System.out.println("\n  area of circle is---- "+a.compute(20.0f, 30.0f));

	}

}
