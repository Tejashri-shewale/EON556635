package Strings;
import java.util.*;
public class LowerUpperCase {

	public static void main(String[] args) 
	{
		Scanner s=new Scanner(System.in);
		String str=" ";
		System.out.println("Enter any string ");
		str=s.nextLine();
		String lower=" ",upper=" ";
		lower=str.toLowerCase();
		upper=str.toUpperCase();
		System.out.println("Original String "+str);
		System.out.println("Lower String "+lower);
		System.out.println("Upper String "+upper);
	

	}

}
