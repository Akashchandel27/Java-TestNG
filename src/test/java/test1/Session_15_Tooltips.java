package test1;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Session_15_Tooltips {

	public static void main(String[] args) {
		
		
		// Launch chrome browser
		System.setProperty("webdriver.chrome.driver",
				"C:\\Users\\akash.chandel\\Downloads\\chromedriver_win32 (2)\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();

		driver.get("https://testautomationpractice.blogspot.com/");
		driver.manage().window().maximize();
		
		// find the web element age input box
		String tooltip = driver.findElement(By.xpath("//input[@id='age']")).getAttribute("title");
		System.out.println(tooltip);
		
		String tooltip1 = "We ask for your age only for statistical purposes.";
		
		if(tooltip1.equals(tooltip)) {
			System.out.println("test passed");
		}
		else
			System.out.println("test failed");

	}

}
