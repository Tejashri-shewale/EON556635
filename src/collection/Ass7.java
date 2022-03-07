package collection;

import java.util.Vector;

public class Ass7 
{

	public static void main(String[] args) 
	{
		
		int n = 6;
		 Vector<Integer> v =new Vector<Integer>(n);
		
			 v.add(1);
			 v.add(2);
			 v.add(3);
			 v.add(4);
			 System.out.println(v);
			 
			 v.remove(3);
			 System.out.println(v);
		
			 
			 for(int i=0;i<v.size();i++)
			 {
				 System.out.println(v.get(i)+"  ");
			 }
			 
	
		 
	}

}
