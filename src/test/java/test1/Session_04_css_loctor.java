package test1;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Session_04_css_loctor {

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
		
		//locator user-name - tag id
		driver.findElement(By.cssSelector("input#user-name")).sendKeys("standard_user");
		
		//locator password-tag[attribute-value]
		driver.findElement(By.cssSelector("input[name=password")).sendKeys("secret_sauce");
		
		//locator
		driver.findElement(By.cssSelector("input#login-button")).click();
		
		//locator login class [attribute-value]
		driver.findElement(By.cssSelector("button.btn[name=add-to-cart-sauce-labs-backpack")).click();
		
		
		// tag[attribute$-substring]
		driver.findElement(By.cssSelector("button[name$=light")).click();
		
		

	}

}
