package collection;
import java.util.ArrayList;
public class Ass1 
{


		ArrayList<Integer> list= new ArrayList<Integer>();
		ArrayList<Integer> saveEvenNumbers(int N) {
			 list= new ArrayList<Integer>();
			for(int i=2;i<=N;i++)
			{
				if(i%2==0)
					list.add(i);
			}
			return list;
		
		}
		ArrayList<Integer> printEvenNumbers() 
		{
			ArrayList <Integer>newlist= new ArrayList<Integer>();
			
			for(int item:list)
			{
				newlist.add(item*2);
				System.out.println(item*2);
			}
			return newlist;
		}
			
			public static void main(String args[]) 
			{
				Ass1 a=new Ass1();
				a.saveEvenNumbers(10);
				a.printEvenNumbers();
			}
	

			}


