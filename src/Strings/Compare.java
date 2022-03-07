package Strings;

import java.lang.*;
public class Compare {

	public static void main(String[] args) 
	{
		String str1="tejashri";
		String str2="shubham";
		System.out.println("String 1 "+str1);
		System.out.println("String 2 "+str2);
		
		int res=str1.compareTo(str2);
		if(res<0)
		{
			System.out.println(" "+str1+" "+" equal to "+" "+str2+" ");
		}
		else
		{
			System.out.println(" "+str1+" "+" not equal to "+" "+str2+" ");
		}
		
	

	}

}
