package java8;

import java.util.function.Function;

public class FunctionEx2 {

	public static void main(String[] args) 
	{
		int amt=3;
		Function<Integer,Integer> sum = i->i+i;
		Function<Integer,Integer> sq = i->i*i;
		
		System.out.println(sum.apply(amt));
		System.out.println(sq.apply(amt));
		System.out.println(sum.andThen(sq).apply(amt));
		System.out.println(sum.compose(sq).apply(amt));
	}

}
