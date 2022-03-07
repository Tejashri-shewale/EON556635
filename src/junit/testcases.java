package junit;

import static org.junit.Assert.*;

import org.junit.Test;

public class testcases {

	@Test
	public void test() 
	{
		Sum s=new Sum();
		assertEquals(10,s.testsum(5,5));
	}

}
