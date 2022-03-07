package WrapperClass;

import java.io.BufferedReader;
import java.io.InputStreamReader;

public class Demo {

	public static void main(String[] args) 
	{
		try {
			InputStreamReader isr=new InputStreamReader(System.in);
			BufferedReader br=new BufferedReader(isr);
			 
			System.out.println("enter any number");
			String num=br.readLine();
			System.out.println("my number is "+num);
			
			int n=Integer.parseInt(num);
			float fn=Integer.parseInt(num);
			double dn=Integer.parseInt(num);
			
			System.out.println(n);
			System.out.println(fn);
			System.out.println(dn);
			}
		catch(Exception e)
		
		{
			System.out.println(e);
		}

	}

}
