package controls;
import java.util.*;
public class Reverse 
{
	
	public static void main(String args[])
	{
	Scanner s=new Scanner(System.in);
	
	System.out.println("\n enter number");
	
	int num=s.nextInt();
	
	int rem,res=0;
	
	while(num>0)
	{
		rem=num%10;
		
		res=res*10+rem;
		
		num=num/10;
		
	}
	
	System.out.println("\n reverse nuber is: "+res);
	
}

}
