package array;
import java.util.*;

public class AverageArray {

	public static void main(String[] args) 
	{
		System.out.println("\n how many element you want to enter ");
		Scanner s=new Scanner(System.in);
		int n=s.nextInt();
		
		int a[]= new int[n];
		int total=0;
		for(int i=0;i<a.length;i++)
		{
			System.out.println("elements Are"+(i+1)+" ");
			a[i]=s.nextInt();
			
		}
		for(int i=0;i<a.length;i++)
		{
			total=total+a[i];
		}
		int avg=total/a.length;
		System.out.println("Average is \n "+avg);

	}

}
