package collection;


import java.util.*;
public class MapEx2 {

	public static void main(String[] args)
	{
		Map<Integer,String>map=new LinkedHashMap<Integer,String>();
		
		map.put(new Integer(103),"tejashri");
		map.put(new Integer(102),"sayli");
		map.put(new Integer(101),"aadnya");
		Set s=map.entrySet();
		System.out.println(map);
		Iterator itr=s.iterator();
		while(itr.hasNext())
		{
			Map.Entry m=(Map.Entry)itr.next();
			System.out.println(m.getKey()+" "+m.getValue());
		}
		

	}

}
