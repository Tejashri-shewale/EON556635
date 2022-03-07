package collection;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Vector;

class Emp1
{
	private int id;
	private String name;
	private String addr;
	private Double sal;
	
	public Emp1(int id,String name,String addr,Double sal)
	{
		super();
		this.id=id;
		this.name=name;
		this.addr=addr;
		this.sal=sal;
		
	}
	public int getId()
	{
		return id;
	}
	
	public String toString()
	{
		return "Employee1 [id = "+id+", name "+name+",addr = "+addr+", sal "+sal+"]";
	}
}

public class Ass8 
{

	public static void main(String[] args) 
	{
		Vector<Emp1> v =new Vector<>();
		v.add(new Emp1(1,"teju","india",20000.0));
		v.add(new Emp1(2,"sayli","usa",20000.0));
		v.add(new Emp1(3,"aadnya","chaina",20000.0));
		v.add(new Emp1(4,"dipali","nepal",20000.0));
		
		Iterator<Emp1> it = v.iterator();
		int searchId=3;
		while(it.hasNext())
		{
			Emp1 emp = it.next();
			if(emp.getId()==searchId)
			{
				System.out.println(emp);
			}
		}

	}
}