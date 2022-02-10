package controls;
import java.util.*;
public class Ifclass {

	public static void main(String[] args) 
	{
		int marks;
		Scanner s=new Scanner(System.in);
		System.out.println("\n Enter number");
		 marks=s.nextInt();
		if(marks>=36)
		{
			System.out.println("\n you are pass");
		}
		else
		{
			System.out.println("\n you ae fail");
		}

	}

}
