package test_ng;

import org.testng.annotations.Test;

public class Session_37_incocationcount {
	
	
	@Test (invocationCount = 5)
	public void testMethod1() {
		System.out.println("Test method1 . .. . . . .");
	}
	
	
	@Test
	public void testMethod2() {
		System.out.println("Test method2 . .. . . . .");
	}

}
