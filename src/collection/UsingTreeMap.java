package collection;


import java.util.Collection;
import java.util.Map;
import java.util.*;
import java.util.Iterator;


public class UsingTreeMap {

	public static void main(String[] args)
	{
		Map<Integer,String>map=new TreeMap<Integer,String>();
		
		Map<Integer,String>map1=new TreeMap<Integer,String>();
		
		
		map.put(new Integer(101),"rollno 1");
		map.put(new Integer(102),"rollno 2");
		map.put(new Integer(103),"rollno 3");
		map1.putAll(map);
		System.out.println("new map "+map1);
		map.clear();
		System.out.println("old map "+map);
		Collection c=map1.values();
		Iterator itr= c.iterator();
		while( itr.hasNext()) {
			System.out.println(itr.next());
		

	}
	}
}
