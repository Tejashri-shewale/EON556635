package operators;

public class Precedenceoperator
{

	public static void main(String[] args) 
	{
		int a=10,b=12,c=4,d=5;
		int cal= d++*2+(++c)/a;
		System.out.println(cal);
	}

}
