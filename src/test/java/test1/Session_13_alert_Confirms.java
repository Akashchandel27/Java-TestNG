package test1;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;


public class Session_13_alert_Confirms {

	public static void main(String[] args) {
		
		 // in Alert we have two button confirm and cancel 
		System.setProperty("webdriver.chrome.driver",
				"C:\\Users\\akash.chandel\\Downloads\\chromedriver_win32 (2)\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();

		driver.get("http://uitestpractice.com/Students/Switchto");
		driver.manage().window().maximize();
		
		driver.findElement(By.xpath("//button[@id='confirm']")).click();
		
		
		
		//driver.switchTo().alert().dismiss(); // to cancel alert
		driver.switchTo().alert().accept();

	}

}
