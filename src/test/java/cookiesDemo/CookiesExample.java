package cookiesDemo;

import java.util.Set;

import org.openqa.selenium.Cookie;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class CookiesExample {

	public static void main(String[] args) {
		
		System.setProperty("webdriver.chrome.driver",
				"C:\\Users\\akash.chandel\\Downloads\\chromedriver_win32 (3)\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		

		// open URL
		driver.get("https://www.google.com");
		
		// Capture all the cookies
		Set <Cookie> cookiesList = driver.manage().getCookies();
		
		// print size/number of cookies
		System.out.println(cookiesList.size());
		
		for(Cookie ck:cookiesList) {
			System.out.println(ck.getName() + " :" + ck.getValue());
		}
		

	}

}
