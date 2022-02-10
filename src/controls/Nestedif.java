package controls;
import java.util.*;
public class Nestedif {

	public static void main(String[] args) 
	{
		int a,b,c;
		int max=0;
		Scanner s=new Scanner(System.in);
		System.out.println(" \n Enter value of A : ");
		a=s.nextInt();
		
		System.out.println(" \n Enter value of B : ");
		b=s.nextInt();

		System.out.println(" \n Enter value od C : ");
		c=s.nextInt();
		
		if(a>b)
		{
			if(a>c)
				max=a;
			else
				max=c;
		}
		else
		{
			if(b>c)
				max=b;
			else
				max=c;
		}
		
		System.out.println("\n max value : " +max);


	}

}
