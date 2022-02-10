package controls;

public class Return 
{
	public int show(int c,int d)
	{
		return c+d;
	}
	

	public static void main(String[] args) 
	{
		Return r=new Return();
		System.out.println("...."+r.show(10, 20));
		

	}

}
