package collection;

import java.util.LinkedHashSet;

public class LinkedHashSetEx {

	public static void main(String[] args) 
	{
		LinkedHashSet<String>ls=new LinkedHashSet();
		ls.add(new String("one"));
		ls.add(new String("two"));
		ls.add(new String("three"));
		
		Object a[]=ls.toArray();
		for(int i=0;i<3;i++)
		{
			System.out.println(a[i]);
		}

	}

}
