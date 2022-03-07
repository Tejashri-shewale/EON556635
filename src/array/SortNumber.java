package array;

public class SortNumber 
{

	public static void main(String[] args) 
	{
		int [] a = new int[] {55,44,22,11,33};
		int temp=0;
		System.out.println("original array \n ");
		for(int i=0;i<a.length;i++)
		{
			System.out.println(a[i]+" ");
		}
		
		for(int i=0;i<a.length;i++)
		{
			for(int j=i+1;j<a.length;j++)
			{
				if(a[i]>a[j])
				{
					temp=a[i];
					a[i]=a[j];
					a[j]=temp;
				}
			}
		}
		
		System.out.println(" sorted array is \n ");
		for(int i=0;i<a.length;i++)
		{
			System.out.println(a[i]  +"");
		}

	}

}
