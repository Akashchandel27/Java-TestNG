package test1;

import java.net.HttpURLConnection;
import java.net.MalformedURLException;
import java.net.URL;
import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Session_08_broken_links {

	public static void main(String[] args) throws Exception {

		System.setProperty("webdriver.chrome.driver","C:\\Users\\akash.chandel\\Downloads\\chromedriver_win32 (2)\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();

		// wait
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);

		driver.get("http://www.deadlinkcity.com//");
		driver.manage().window().maximize();

		List<WebElement> linklist = driver.findElements(By.tagName("a"));

		int rescode = 200;
		int brokenLinkCnt = 0;

		System.out.println("total links in web page" + linklist);
		for (WebElement element : linklist) {
			String url = element.getAttribute("href");

			try {

				URL urlLink = new URL(url);

				HttpURLConnection huc = (HttpURLConnection) urlLink.openConnection();
				huc.setRequestMethod("HEAD");
				huc.connect();

				rescode = huc.getResponseCode();

				if (rescode >= 400) {
					System.out.println(url + "broken link.");
					brokenLinkCnt++;
				}
			} catch (MalformedURLException e) {
			}

		}
		System.out.println("total broken links:" + brokenLinkCnt);
	}
}
