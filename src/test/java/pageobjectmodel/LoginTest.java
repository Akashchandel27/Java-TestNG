package pageobjectmodel;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class LoginTest {

	public static void main(String[] args) {
		
		System.setProperty("webdriver.chrome.driver",
				"C:\\Users\\akash.chandel\\Downloads\\chromedriver_win32 (3)\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		
		LoginPage2 loginpg = new LoginPage2(driver);
		
		

		// open URL
		driver.get("https://www.saucedemo.com/");
		
		// create object of login page
		loginpg.enterUsername("standard_user");
		loginpg.enterPassword("secret_sauce");
		loginpg.ClickOnLoginBtn();
		
		
		

	}

}
