package collection;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Set;
import java.util.TreeSet;
public class Demo {

	public static void main(String[] args)
	{
		//List l=new ArrayList();
		Set <String>l=new TreeSet();
		l.add("sayli");
		l.add("Tejashri");
		l.add("sushi");
		l.add("priya");
		l.add("aarti");
		l.add("rucha");
		
//		l.add(1);
//		l.add("Tejashri");
//		l.add(2.1);
//		l.add(true);
		
		 //USING FOR LOOP
		
//		for(int i=0;i<l.size();i++)
//		{
//			System.out.println(l.get(i));
//		}
		
		// USING ITERATOR
//		
//		Iterator it=l.iterator();
//		while(it.hasNext())
//		{
//			System.out.println(it.next());
//		}
		
		
		// USING CLASS OBJECT
//		
//		for(Object obj:l)
//		{
//			System.out.println(obj);
//		}
		
		
		//USING STREAM METHOD
		
		l.stream().forEach(e->System.out.println(e));

	}

	
}
