package collection;

import java.util.ArrayList;
import java.util.Iterator;

public class ArrayListEx {

	public static void main(String[] args)
	{
		ArrayList al=new ArrayList();
		al.add(1);
		al.add("Tejashri");
		al.add(2.1);
		al.add(true);
		
		Iterator it= al.iterator();
		while(it.hasNext())
		{
			System.out.println(it.next());
		}

	}

}
