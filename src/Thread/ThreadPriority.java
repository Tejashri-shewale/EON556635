package Thread;

	class Demo extends Thread
	{
		public void run()
		{
		System.out.println(" Thread started");
		
		for(int i=0;i<=4;i++)
		{
			System.out.println("Thread i "+i);
		}
		System.out.println("Exit Thread ");
	
		}
	}
	
	class Demo11 extends Thread
	{
		public void run()
		{
		System.out.println(" Thread started");
		
		for(int i=0;i<=4;i++)
		{
			System.out.println("Thread i "+i);
		}
		System.out.println("Exit Thread ");
	
		}
	}
	
	class Demo2 extends Thread
	{
		public void run()
		{
		System.out.println(" Thread started");
		
		for(int i=0;i<=4;i++)
		{
			System.out.println("Thread i "+i);
		}
		System.out.println("Exit Thread ");
	
		}
	}
class ThreadPriority 
{

	public static void main(String[] args)
	{
		Demo a=new Demo();
		Demo11 b=new Demo11();
		Demo2 c=new Demo2();
		c.setPriority(Thread.MAX_PRIORITY);
		b.setPriority(b.getPriority()+1);
		a.setPriority(Thread.MIN_PRIORITY);
		a.start();
		b.start();
		c.start();
	}
}

