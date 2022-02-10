package operators;

public class Bitwiseor {

	public static void main(String[] args) 
	{
		int a=5;int b=7;
		
		//AND
		
		System.out.println("a&b"+(a&b));
		
		//OR
		
		System.out.println("a|b"+(a|b));
		
		//XOR
		
		System.out.println("a^b"+(a^b));
		
		//COMPLIEMENT
		
		System.out.println("~a= "+~a);
		
		a&=b;
		System.out.println("a= "+a);


	}

}
