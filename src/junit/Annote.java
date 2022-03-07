package junit;

import static org.junit.Assert.*;



	import org.junit.After;
	import org.junit.AfterClass;
	import org.junit.Before;
	import org.junit.BeforeClass;
	import org.junit.Test;

	public class Annote
	{
		@BeforeClass
		public static void beforeClass()
		{
			System.out.println("Before Class");
		}
		
		@AfterClass
		public static void afterClass()
		{
			System.out.println("After Class");
		}
		@Before  
		public static void before()
		{
			System.out.println(" Before");
		}
		@After  
		public static void after()
		{
			System.out.println(" Before");
		}


		@Test
		public void test() {
			System.out.println("test ");
		}
	
}
