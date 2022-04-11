package javastream;

import java.util.Arrays;
import java.util.List;
import java.util.Set;
import java.util.stream.Collectors;
import java.util.stream.*;
 class StreamDemo
{

	public static void main(String[] args)
	{
		// list of integer
		
		List<Integer> number =Arrays.asList(1,2,3,4,5);
		List<Integer> square = number.stream().map(x->x*x).collect(Collectors.toList());
		
		System.out.println(square);
		
		//list of String
		
		List<String> names =Arrays.asList("tejashri","swati","pooja");
		List<String> result = names.stream().filter(s->s.startsWith("t")).collect(Collectors.toList());
		System.out.println(result);
		
		
		//Collect method
		
		List<Integer> numbers = Arrays.asList(1,2,3,4,5);
		
		Set<Integer> squareSet = numbers.stream().map(x->x*x).collect(Collectors.toSet());
		System.out.println(squareSet);
		
		// sort method
		
		List<String> show = names.stream().sorted().collect(Collectors.toList());
		System.out.println(show);
		
		// foreach method
		
		number.stream().map(x->x*x).forEach(y->System.out.println(y));
		
		//reduce method
		
		int even = number.stream().filter(x->x%2==0).reduce(0, (ans,i)->ans+i);
		System.out.println(even);
	}

}
