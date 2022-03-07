package array;
import java.lang.*;
import java.util.Arrays;
public class SortString {

	public static void main(String[] args) 
	{
		String [] name= {"Tejashri","Shubham","Sayli","Rohit"};
		int size=name.length;
		for(int i=0;i<size-1;i++) 
		{
			for(int j=i+1;j<name.length;j++)
			{
				if(name[i].compareTo(name[j])>0)
				{
					String temp=name[i];
					name[i]=name[j];
					name[j]=temp;
					
				}
			}
		}
		System.out.println(Arrays.toString(name));

	}

}
