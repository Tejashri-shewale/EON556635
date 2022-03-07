package collection;

import java.util.ArrayList;
import java.util.List;

class MyArray<E> extends ArrayList<E>
{
	public boolean add(E e)
	{
		if(e instanceof Integer ||e instanceof Float || e instanceof Double)
		{
			super.add(e);
			return true;
		}
		else
		{
			throw new ClassCastException("Only Integr,Float,Double");
		}
	}
}

public class Ass4 {

	public static void main(String[] args)
	{
		List<Object> list = new MyArray<>();
		try
		{
			list.add(15);
			list.add(1.2F);
			list.add(3.1412D);
			list.add("test");
			
		}
		catch(Exception e)
		{
			e.printStackTrace();
		}
		
		System.out.println(list);
	}

}
