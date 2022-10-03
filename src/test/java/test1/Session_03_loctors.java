package test1;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Session_03_loctors {

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

		// find the element by the user-name
		driver.findElement(By.id("user-name")).sendKeys("standard_user");

		// by password
		driver.findElement(By.id("password")).sendKeys("secret_sauce");

		// click on the button
		driver.findElement(By.id("login-button")).click();

		// switch to product page
//		String currentWindowHandle = driver.getWindowHandle();
//		driver.switchTo().window(currentWindowHandle);

		// locate linktext-- it will search for the particular keyword
		//driver.findElement(By.linkText("Sauce Labs Bolt T-Shirt")).click();

 	   //locate particular-- it will search for the particular keyword with the word sauce
       //driver.findElement(By.partialLinkText("Sauce")).click();
		
		// find element give - nosuchelementsfoundexpection
		// find elements :-  give the empty string

		// to find the count the element sauce
		List<WebElement> elementlist = driver.findElements(By.partialLinkText("Sauce"));
		System.out.println("Element Size :- " + elementlist.size());

	}

}
