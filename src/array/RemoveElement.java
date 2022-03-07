package array;

import java.util.Arrays;

public class RemoveElement {

	public static void main(String[] args) 
	{
		int []a=new int[] {33,22,55,44,66,77};
		System.out.println("\n Original array  "+Arrays.toString(a));
		
		int r=1;
		for(int i=r;i<a.length-1;i++)
		{
			a[i]=a[i+1];
		}
		System.out.println("Removed Element is "+Arrays.toString(a));
	}

}
