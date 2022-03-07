package collection;


import java.util.Iterator;
import java.util.LinkedList;

public class LinkedListEx {

	public static void main(String[] args) 
	{
		LinkedList al=new LinkedList();
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
