package test1;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Session_10_click_on_image {

	public static void main(String[] args) {
		
		System.setProperty("webdriver.chrome.driver","C:\\Users\\akash.chandel\\Downloads\\chromedriver_win32 (2)\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		
		driver.get("https://www.opencart.com/index.php?route=common/home");
		driver.manage().window().maximize();
		
		driver.findElement(By.xpath("//img[@title='OpenCart - Open Source Shopping Cart Solution']")).click();
		
		if(driver.getTitle().equals("OpenCart - Open Source Shopping Cart Solution"));
		{
			System.out.println("Test pass");
		}
		
		
		//driver.close
		driver.close();
	}

}
