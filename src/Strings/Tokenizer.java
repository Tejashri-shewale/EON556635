package Strings;

import java.util.StringTokenizer;

public class Tokenizer {

	public static void main(String[] args) 
	{
		StringTokenizer st=new StringTokenizer("my name is tejashri","");
		while(st.hasMoreElements())
		{
			System.out.println(st.nextToken());
		}

	}

}
