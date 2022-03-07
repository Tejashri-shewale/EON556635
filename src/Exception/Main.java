package Exception;

class MyException extends Exception
{
	public MyException(String s)
	{
		super(s);
	}
}

public class Main 
{

	public static void main(String[] args) 
	{
		try
		{
			throw new MyException("MyException occures ");
		}
		catch(MyException e)
		{
			System.out.println("caught ");
			System.out.println(e.getMessage());
		}

	}

}
