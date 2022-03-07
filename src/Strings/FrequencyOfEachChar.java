package Strings;

public class FrequencyOfEachChar {

	public static void main(String[] args) 
	{
		String str="Welcome to java";
		int[]freq=new int[str.length()];
		int i,j;
		char[]String=str.toCharArray();
		for(i=0;i<str.length();i++)
		{
			freq[i]=1;
			for(j=i+1;j<str.length();j++)
			{
				if(String[i]==String[j])
				{
					freq[i]++;
					String[j]='0';
					
				}
			}
		}
		System.out.println("Character and their Frequency ");
		for(i=0;i<freq.length;i++)
		{
			if(String[i]!='0'&&String[i]!='0')
			{
				System.out.println(String[i]+"-"+freq[i]);
			}
		}
		
	}

}
