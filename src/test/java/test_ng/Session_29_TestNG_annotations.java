package test_ng;
import org.testng.annotations.*;

public class Session_29_TestNG_annotations {
	
	
	@BeforeSuite
	public void beforesuite() {
		System.out.println("before suite");
	}
	
	
	@AfterSuite
	public void Aftersuite() {
		System.out.println("After suite");
	}
	
	@BeforeTest
	public void beforeTest() {
		
		System.out.println("Before Test");
	}
	
	@AfterTest
	public void AfterTest() {
		
		System.out.println("After Test");
	}
	
	
	@BeforeClass
	public void beforeclass() {
		System.out.println("Before class");
	}
	
	@BeforeMethod
    public void beforeMethod() {
    	System.out.println("this is before method");
    }
	
	@AfterMethod
    public void afterMethod() {
    	System.out.println("this is after method");
    }
	@Test
    public void test1() {
    	System.out.println("this is test1");
    }
    
    @Test
    public void test2() {
    	System.out.println("this is test2");
    }
    
    @AfterClass
	public void Afterclass() {
		System.out.println("After class");
	}
    

}
