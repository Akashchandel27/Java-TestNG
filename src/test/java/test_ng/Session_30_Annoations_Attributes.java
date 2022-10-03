package test_ng;
import org.testng.annotations.*;

public class Session_30_Annoations_Attributes {
	
	//@Test(description ="This is testcase1",priority=2)
	@Test(dependsOnMethods = {"testcases2"})
	public void testcases1() {
		System.out.println("Mobile login test cases");	
	}
	
	//@Test(description ="This is testcase2",priority=3)
	@Test
	public void testcases2() {
		System.out.println("Web login test cases");
		
	}
	
	//@Test(description ="This is testcase3")
	//@Test(priority=-1)
	public void testcases3() {
		System.out.println("API login test cases");
		
	}

}
