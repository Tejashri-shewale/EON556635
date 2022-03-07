package collection;

import java.util.HashSet;
import java.util.Set;
import java.util.Iterator;


public class Hashset {

	public static void main(String[] args) 
	{
		Set hash=new HashSet();
		hash.add("a");
		hash.add("b");
		hash.add("c");
		hash.add("d");
		
		Iterator it= hash.iterator();
		while(it.hasNext())
		{
			System.out.println(it.next());
		}
	}

}
