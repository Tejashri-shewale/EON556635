package iheritance;

class sem11
{
	int a,b;
	public void input()
	{
		a=10;
		b=20;
	}
	public void display()
	{
		System.out.println("  value of a-- "+a);
		System.out.println("  value of b-- "+b);
	}
}
	interface sem22
	{
		static final int x=36;
		public abstract void show();
	}
	
	interface sem33
	{
		static final int x=44;
		public abstract void speed();
	}
public class MultipleInheritance extends sem11 implements sem22,sem33
{

	public static void main(String[] args) 
	{
		
		MultipleInheritance m =new MultipleInheritance();
		m.input();
		m.display();
		m.speed();
		m.show();
	}

	@Override
	public void show() {
		System.out.println("abstract method");
		System.out.println("value of x--- "+sem22.x);
		
	}

	@Override
	public void speed() {
		
		System.out.println("abstract method");
		System.out.println("value of x--- "+sem33.x);
	}

}
