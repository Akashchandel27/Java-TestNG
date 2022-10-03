package test_ng;

import org.testng.annotations.Test;
import org.testng.AssertJUnit;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Session_26_testngdemo {

	@Test
	public void verifyPageTitle() {

		// Launch chrome browser
		System.setProperty("webdriver.chrome.driver",
				"C:\\Users\\akash.chandel\\Downloads\\chromedriver_win32 (3)\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		

		// open URL
		driver.get("https://www.google.com");
		String expectedTitle = "Google";
		String actualTitle = driver.getTitle();

		AssertJUnit.assertEquals(actualTitle,expectedTitle);

		driver.quit();

	}

}
