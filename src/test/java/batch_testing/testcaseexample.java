package batch_testing;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class testcaseexample {

	public static void main(String[] args) {

		// Launching the browser
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\akash.chandel\\Downloads\\chromedriver_win32 (3)\\chromedriver.exe");

		// Webdriver is interface----- Chromedriver is a clas
		WebDriver driver = new ChromeDriver();

		// Enter the URL
		driver.get("https://www.saucedemo.com/");

		// Manger window, maximize and the browser
		driver.manage().window().maximize();

		driver.findElement(By.id("user-name")).sendKeys("standard_user");

		// by password
		driver.findElement(By.id("password")).sendKeys("secret_sauce");

		// click on the button
		driver.findElement(By.id("login-button")).click();

	}

}
