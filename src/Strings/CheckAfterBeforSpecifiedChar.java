package Strings;

public class CheckAfterBeforSpecifiedChar {
	public boolean leftAndRightSame(String str)
	{
		int l=str.length();
		boolean found=true;
		for(int i=0;i<l;i++)
		{
			String tempstr=str.substring(i,i+1);
			if(tempstr.equals("#")&&i>0&&i<l-1)
			{
				if(str.charAt(i-1)==str.charAt(i+1))
				{
					found=true;
				}
				else
					found=false;
			
			}
		}
		return found;
	}

	public static void main(String[] args)
	{
		
		CheckAfterBeforSpecifiedChar c=new CheckAfterBeforSpecifiedChar();
		String str1="moon#night";
		System.out.println("GIven String "+str1);
		System.out.println("After And Before cha is "+c.leftAndRightSame(str1));
		

	}

}
