package test_ng;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Action;
import org.openqa.selenium.interactions.Actions;

public class Session_44_Loginform {

	public static void main(String[] args) {

		System.setProperty("webdriver.chrome.driver",
				"C:\\Users\\akash.chandel\\Downloads\\chromedriver_win32 (3)\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();

		// open URL
		driver.get("https://www.saucedemo.com/");

//		// Find & enter user-name
//		driver.findElement(By.id("user-name")).sendKeys("standard_user");
//
//		// Find & enter password
//		driver.findElement(By.id("password")).sendKeys("secret_sauce");
//
//		// click on the login button
//		driver.findElement(By.id("login-button")).click();
		
		
		Actions actions = new Actions(driver);
		Action seriesOfAction = actions.moveToElement(driver.findElement(By.id("user-name")))
				.click()
				.sendKeys("standard_user",Keys.TAB)
				.sendKeys("secret_sauce",Keys.ENTER).build();
		      seriesOfAction.perform();
		
		
		
	}

}
