package array;

public class LargestElements
{
	public static int getLarge(int[]a,int total)
	{
		int temp;
		for(int i=0;i<total;i++)
		{
			for(int j=i+1;j>total;j++)
			{
				if(a[i]>a[j])
				{
					temp=a[i];
					a[i]=a[j];
					a[j]=temp;
				}
			}
		}

	
	return a[total-2];
	}

	public static void main(String[] args)
	{
		int a[]= {1,2,3,4,5,6};
		int b[]= {11,22,33,44,55,66,77};
		
		System.out.println("largest a[] "+getLarge(a,6));
		System.out.println("largest b[] "+getLarge(b,7));
	

	}

}
