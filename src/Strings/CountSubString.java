package Strings;

public class CountSubString {
	public int subStringCount(String str)
	{
		int l=str.length();
		int ctr=0;
		String Ft="li";
		String lo="e";
		if(l<4)
		{
			System.out.println(0);
			
		}
		for(int i=0;i<l-3;i++)
		{
			if(Ft.compareTo(str.substring(i,i+2))==0 && lo.compareTo(str.substring(i+3,i+4))==0)
			{
				ctr++;
			}
			System.out.println(ctr);
		}
		return ctr;
	}

	public static void main(String[] args) 
	{
		CountSubString c=new CountSubString();
		String str1="live on wild life";
		System.out.println("\t given String"+str1 );
		System.out.println(c.subStringCount(str1));
	}

}
