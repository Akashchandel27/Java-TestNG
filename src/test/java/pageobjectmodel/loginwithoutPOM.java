package pageobjectmodel;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class loginwithoutPOM {

	public static void main(String[] args) {

		// Launch chrome browser
		System.setProperty("webdriver.chrome.driver",
				"C:\\Users\\akash.chandel\\Downloads\\chromedriver_win32 (3)\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();

		// open URL
		driver.get("https://www.saucedemo.com/");
		
		// Find & enter user-name
		driver.findElement(By.id("user-name")).sendKeys("standard_user");
		
		
		// Find & enter password
	     driver.findElement(By.id("password")).sendKeys("secret_sauce");
	     
	    // click on the login button
	     driver.findElement(By.id("login-button")).click();
	}

}
