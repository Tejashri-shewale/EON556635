package Thread;

class A implements Runnable
//class A extends Thread
{
	public void run()
	{
		System.out.println(" Thread A is started");
		for(int i=0;i<=10;i++)
		{
			System.out.println(" Thread A Index "+i);
		}
		System.out.println("thread A Exit");
	}
}
class B implements Runnable
//class B extends Thread
{
	public void run()
	{
		System.out.println(" Thread B is started");
		for(int k=0;k<=10;k++)
		{
			System.out.println(" Thread B Index "+k);
		}
		System.out.println("thread B Exit");
	}
}
class C implements Runnable
//class C extends Thread
{
	public void run()
	{
		System.out.println(" Thread C is started");
		for(int j=0;j<=10;j++)
		{
			System.out.println(" Thread C Index "+j);
		}
		System.out.println("thread C Exit");
	}
}
public class MultiThread {

	public static void main(String[] args) 
	{
		A a=new A();
		B b=new B();
		C c=new C();
		
		
		Thread t1=new Thread(a);
		Thread t2=new Thread(b);
		Thread t3=new Thread(c);
		
//		a.run();
//		b.run();
//		c.run();
		
		t1.start();
		t2.start();
		t3.start();
}

}
