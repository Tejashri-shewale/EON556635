package java8;

import java.util.function.Function;

public class FunctionEx1 {

	public static void main(String[] args)
	{
		Function<String , Integer> fun = s->s.length();
		System.out.println(fun.apply("hello"));
	}

}
