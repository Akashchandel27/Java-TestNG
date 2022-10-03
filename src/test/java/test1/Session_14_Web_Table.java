package test1;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Session_14_Web_Table {

	public static void main(String[] args) {
		

		System.setProperty("webdriver.chrome.driver",
				"C:\\Users\\akash.chandel\\Downloads\\chromedriver_win32 (2)\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();

		driver.get("C:\\Users\\akash.chandel\\eclipse-workspace\\codestudio\\Akash.html");
		driver.manage().window().maximize();
		
		String text =driver.findElement(By.xpath("//table/tbody/tr[4]/td[5]")).getText();
		System.out.println(text);
		
		
		//Find total rows in the web table
		List <WebElement> rowList = driver.findElements(By.xpath("//table/tbody/tr"));
		System.out.println(rowList.size());
		
		//Find total col in the web table
		List <WebElement> colList =driver.findElements(By.xpath("//table/tbody/tr[1]/th"));
		System.out.println(colList.size());
		
		for (int r =2; r<=rowList.size(); r++)
		{
			for (int c=1; c<=colList.size(); c++)
			{
				String data = ((WebElement) driver.findElements(By.xpath("/table/tbody/tr[" + r + "]/td[" + c+ "]"))).getText();
				
				System.out.println(data);
		}
	}

	}
}
