package Strings;

public class PalindromString {

	public static void main(String[] args)
	{
		String str="tst";
		boolean flag =true;
		for(int i=0;i<str.length()/2;i++)
		{
			if(str.charAt(i)!=str.charAt(str.length()-1))
			{
				flag=false;
				break;
			
			}
		}
		
		if(flag)
			System.out.println("String is palindrom");
		else
			System.out.println("String not palindrom");
		

	}

}
