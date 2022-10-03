package test1;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class Session_11_doubleclick {

	public static void main(String[] args) {
		
		System.setProperty("webdriver.chrome.driver","C:\\Users\\akash.chandel\\Downloads\\chromedriver_win32 (2)\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();

		driver.get("https://demoqa.com/buttons");
		driver.manage().window().maximize();

		WebElement button = driver.findElement(By.xpath("//button[@id='doubleClickBtn']"));
		
		Actions act = new Actions(driver);
		act.doubleClick(button).perform(); // double click
		
	}

}
