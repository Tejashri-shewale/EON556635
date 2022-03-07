package Strings;

public class MaxOccureChar {

	public static void main(String[] args)
	{
		String s="Welcome in edubrige ";
		int[]freq= new int[s.length()];
		char max=s.charAt(0);
		char String[]=s.toCharArray();
		for(int i=0;i<String.length;i++)
		{
			freq[i]=1;
			for(int j=i+1;j<String.length;j++)
			{
				if((String[i]==String[j]) && (String[i]!= '0' && String[j]!= '0'))
				{
					freq[i]++;
					String[j]='0';
					
				}
			}
		}
		
		char min = max=(char) freq[0];
		for(int i=0;i<freq.length;i++)
		{
			if(min>freq[i]&&freq[i]!='0')
			{
				min=(char) freq[i];
				min=String[i];
			}
			
			if(max<freq[i])
			{
				max=(char) freq[i];
				max=String[i];
			}
		}
		System.out.println("min char "+min);
		System.out.println("max char "+max);
		
		

	}

}
