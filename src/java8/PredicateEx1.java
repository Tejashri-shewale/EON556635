package java8;

import java.util.function.Predicate;

public class PredicateEx1 
{

	public static void main(String[] args) 
	{
		Predicate<Integer> p= age->(age>18);
		System.out.println(p.test(21));
		System.out.println(p.test(11));
	}

}
