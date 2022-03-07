package collection;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

class Emp
{
	private int id;
	private String name;
	private String addr;
	private Double sal;
	
	public Emp(int id,String name,String addr,Double sal)
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
		return "Employee [id = "+id+", name "+name+",addr = "+addr+", sal "+sal+"]";
	}
}

public class Ass5 {

	public static void main(String[] args) 
	{
		List<Emp> list =new ArrayList<>();
		list.add(new Emp(1,"teju","india",20000.0));
		list.add(new Emp(2,"sayli","usa",20000.0));
		list.add(new Emp(3,"aadnya","chaina",20000.0));
		list.add(new Emp(4,"dipali","nepal",20000.0));
		
		Iterator<Emp> it = list.iterator();
		int searchId=3;
		while(it.hasNext())
		{
			Emp emp = it.next();
			if(emp.getId()==searchId)
			{
				System.out.println(emp);
			}
		}


	}

}
