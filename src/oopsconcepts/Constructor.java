package oopsconcepts;

	 class Rect
	{
		int len,wid;
		Rect(int a,int b)
		{
			len=a;
			wid=b;
			
		}	
		public int area()
			{
				return(len*wid);
			}
		
	}



public class Constructor {

	public static void main(String[] args) 
	{
			Rect r=new Rect(15,11);
			int area1=r.area();
			System.out.println("Area------ "+area1);



	}

}
