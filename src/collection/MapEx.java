package collection;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;

public class MapEx {

	public static void main(String[] args)
	{
		HashMap<String,String>map=new HashMap<String,String>();
		map.put("tejashri", "A");
		map.put("sayli", "B");
		map.put("adnya", "C");
		map.put("dipali", "D");
		System.out.println(map);
		System.out.println(map.values());
		System.out.println(map.get("tejashri"));
		System.out.println(map.keySet());
		
		
		
		Set s=map.entrySet();
		
		Iterator itr=s.iterator();
		while(itr.hasNext())
		{
			Map.Entry m=(Map.Entry)itr.next();
			System.out.println(m.getKey()+" "+m.getValue());
		}
		
	}

}
