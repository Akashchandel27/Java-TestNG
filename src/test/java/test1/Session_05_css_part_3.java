package test1;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Session_05_css_part_3 {

	public static void main(String[] args) {

		// Launching the browser
		System.setProperty("webdriver.chrome.driver",
				"C:\\Users\\akash.chandel\\Downloads\\chromedriver_win32 (2)\\chromedriver.exe");

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

		
		String currentWindowHandle = driver.getWindowHandle();
		driver.switchTo().window(currentWindowHandle);
		
		driver.findElement(By.xpath("//button[@id=\"add-to-cart-sauce-labs-backpack\" and @name='add-to-cart-sauce-labs-backpack']")).click();
		
		driver.findElement(By.xpath("//button[@id=\"add-to-cart-sauce-labs-bike-light\" or @name='add-to-cart-sauce-labs-bike-light']")).click();

	}

}
