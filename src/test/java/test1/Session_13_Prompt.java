package test1;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Session_13_Prompt {

	public static void main(String[] args) {

		System.setProperty("webdriver.chrome.driver",
				"C:\\Users\\akash.chandel\\Downloads\\chromedriver_win32 (2)\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();

		driver.get("http://uitestpractice.com/Students/Switchto");
		driver.manage().window().maximize();
		
		driver.findElement(By.xpath("//button[@id='prompt']")).click();
		
		driver.switchTo().alert().sendKeys("chinu");
	    driver.switchTo().alert().accept();

	}

}
