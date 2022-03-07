package collection;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class Ass3 {

	public static void main(String[] args) 
	{
		List<String> list = new ArrayList<>();
		list.add("1");
		list.add("2");
		list.add("3");
		list.add("4");
		printAll(list);
		
		

	}

	private static void printAll(List<String> list) 
	{
		Iterator<String> it =list.iterator();
		while(it.hasNext())
		{
			System.out.println(it.next());
		}
		
	}

}
