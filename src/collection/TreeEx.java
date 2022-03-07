package collection;

import java.util.Iterator;
import java.util.TreeSet;

public class TreeEx {

	public static void main(String[] args) 
	{
		TreeSet<String>ts=new TreeSet();
		ts.add("ask");
		ts.add("risk");
		ts.add("cat");
		ts.add("dog");
		
		Iterator it= ts.iterator();
		while(it.hasNext())
		{
			System.out.println(it.next().toString());
		}

	}

}
