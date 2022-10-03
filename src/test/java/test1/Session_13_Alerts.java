package test1;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Session_13_Alerts {

	public static void main(String[] args) {
		
		   // in Alert we have only one button 
			System.setProperty("webdriver.chrome.driver",
					"C:\\Users\\akash.chandel\\Downloads\\chromedriver_win32 (2)\\chromedriver.exe");
			WebDriver driver = new ChromeDriver();

			driver.get("http://uitestpractice.com/Students/Switchto");
			driver.manage().window().maximize();
			
			// find alert and perform click actions
			driver.findElement(By.xpath("//button[@id='alert']")).click();
			
			//switch to alert windows and accept the alert
			driver.switchTo().alert().accept(); // ok button is clicked
	

}
}