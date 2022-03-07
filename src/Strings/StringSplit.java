package Strings;

public class StringSplit {

	public static void main(String[] args) 
	{
		String s="java string";
		String[]words=s.split("\\s");
		for(String w:words)
		{
			System.out.println(w);
		}
	}

}
