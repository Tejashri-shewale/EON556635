package java8;
@FunctionalInterface
interface Square
{
	int cal(int x);
}

public class FunctionalInterfaceDemo 
{

	public static void main(String[] args)
	{
		int a=5;
		Square s=(int x)->x*x;
		int ans = s.cal(a);
		System.out.println(ans);

	}

}
//lambda expression