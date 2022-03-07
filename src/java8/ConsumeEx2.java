package java8;

import java.util.function.Consumer;

public class ConsumeEx2 {

	public static void main(String[] args) 
	{
		Consumer<String> con =s-> System.out.println(s.toUpperCase());
		Consumer<String> con1 =s-> System.out.println(s);
		con.andThen(con1).accept("hello ");
	}

}
