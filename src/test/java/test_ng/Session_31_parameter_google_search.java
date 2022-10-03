package test_ng;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

import junit.framework.Assert;

public class Session_31_parameter_google_search {
	
	@Test
	@Parameters({"keyword"})
	public void googlesearch(String searchdata) {
		
		//Launch the chrome browser
		System.setProperty("webdriver.chrome.driver",
				"C:\\Users\\akash.chandel\\Downloads\\chromedriver_win32 (2)\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		
		driver.get("https://www.google.com/");
		
		
		WebElement searchbox = driver.findElement(By.name("q"));
		searchbox.sendKeys(searchdata);
		
		Assert.assertEquals(searchdata, searchbox.getAttribute("value"));
		
		
		driver.quit();
		
		
	}

}
