package test1;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Action;
import org.openqa.selenium.interactions.Actions;

public class Session_11_drag_and_Drop {

	public static void main(String[] args) {
		
		System.setProperty("webdriver.chrome.driver",
				"C:\\Users\\akash.chandel\\Downloads\\chromedriver_win32 (2)\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		
		driver.get("http://dhtmlgoodies.com/scripts/drag-drop-custom/demo-drag-drop-3.html");
		driver.manage().window().maximize();
		
		WebElement source = driver.findElement(By.id("box6")); // rome
		WebElement target = driver.findElement(By.id("box106")); // itlay
		
		Actions act = new Actions(driver);
		
		// Drag and Drop (Source Elements,target Elements)
		act.dragAndDrop(source, target).perform();
		
		
		
		
		
		
		

	}

}
