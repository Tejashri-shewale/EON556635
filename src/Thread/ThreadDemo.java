package Thread;

public class ThreadDemo extends Thread 
{

	public static void main(String[] args) 
	{
		Thread t=new Thread();
	
		System.out.println("current Thread "+t.currentThread());
		t.setName("My Thread 1");
		System.out.println("After Name change.... "+t);
		try
		{
			for(int i=0;i<5;i++)
			{
				System.out.println(i);
				Thread.sleep(2000);
			}
		}
		catch(Exception e)
		{
			System.out.println(e);
		}

	}

}
