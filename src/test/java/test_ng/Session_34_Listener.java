package test_ng;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.SkipException;
import org.testng.annotations.Listeners;
import org.testng.annotations.Test;

import junit.framework.Assert;

@Listeners(TestNG.TestNG.ListenerClass.class)
public class Session_34_Listener {

	
	
	@Test
	public void login() throws Throwable {

		System.setProperty("webdriver.chrome.driver",
				"C:\\Users\\akash.chandel\\Downloads\\chromedriver_win32 (2)\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();

		// Open URL
		driver.get("https://opensource-demo.orangehrmlive.com/web/index.php/auth/login");
		
		
		Thread.sleep(5000);
		
		//Find user-name
		driver.findElement(By.name("username")).sendKeys("Admin");
		
		//input[@name="username"]
		//Find password
		driver.findElement(By.name("password")).sendKeys("admin123");
		
		// find the login button
		
		Assert.assertEquals(driver.getTitle(), "OrangeHRM");

	}
	
	  @Test
	  
	  public void testFail() {
		  System.out.println("Failed test cases");
		  Assert.assertTrue(false);
	  }
	  
	  
 @Test
	  
	  public void testskipped() {
		  System.out.println("skipped  test cases");
		  throw new SkipException("skip excepation thrown");
	  }

}
