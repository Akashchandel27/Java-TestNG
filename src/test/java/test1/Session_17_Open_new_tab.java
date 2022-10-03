package test1;

import java.awt.Window;
import java.util.ArrayList;
import java.util.List;
import java.util.Set;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WindowType;
import org.openqa.selenium.chrome.ChromeDriver;

public class Session_17_Open_new_tab {

	public static void main(String[] args) {
		
		// Launch chrome browser
				System.setProperty("webdriver.chrome.driver",
						"C:\\Users\\akash.chandel\\Downloads\\chromedriver_win32 (2)\\chromedriver.exe");
				WebDriver driver = new ChromeDriver();

				driver.get("https://www.google.com/");
				driver.manage().window().maximize();
				System.out.println(driver.getTitle());
				
				//Open new tab
				driver.switchTo().newWindow(WindowType.TAB);
				driver.get("https://www.facebook.com/");
				System.out.println(driver.getTitle());
				
				//get window handles of open windows
				Set <String> windowHandles = driver.getWindowHandles();
				List <String> handles = new ArrayList<String>();
				handles.addAll(windowHandles);
				
				driver.close();
        		driver.switchTo().window(handles.get(0)); // switch to google.com
				System.out.println(driver.getTitle());
				
				
				
				
				
				
				
				
				
	}

}
