package test_ng;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;


public class Session_35_Assertions {
	
	@Test
	public void testMethod() {
		
		System.setProperty("webdriver.chrome.driver",
				"C:\\Users\\akash.chandel\\Downloads\\chromedriver_win32 (2)\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		
		SoftAssert softverify = new SoftAssert();
		
		
		driver.get("https://testautomationpractice.blogspot.com/");
		
		System.out.println("verifying title.......");
		
		String expectedTitle="Automation Testing Practice1";
		String actualTitle=driver.getTitle();
		softverify.assertEquals(expectedTitle,actualTitle,"failed test case 1" );
		
		System.out.println("verfying presence of wikipedia.icon");
		WebElement icons =driver.findElement(By.className("wikipedia.com"));
		softverify.assertTrue(icons.isDisplayed());
		
		driver.close();
		
		//report all the failure method
		softverify.assertAll();
	}

}
