package test1;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class Session_11_mousehover {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver",
				"C:\\Users\\akash.chandel\\Downloads\\chromedriver_win32 (2)\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		
		
		// Open URL
		driver.get("https://sellglobal.ebay.in/seller-center/");
		driver.manage().window().maximize();
		
		WebElement element = driver.findElement(By.linkText("Shipping & Payments"));
		
		Actions act = new Actions(driver);
		
		act.moveToElement(element).perform();
		
		

	}

}
