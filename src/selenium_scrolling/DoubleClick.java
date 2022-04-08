package selenium_scrolling;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class DoubleClick {

	public static void main(String[] args) throws InterruptedException {

		System.setProperty("webdriver.chrome.driver", "D:\\My Selenium app\\chromedriver_win32\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();

		driver.get("https://demo.guru99.com/test/simple_context_menu.html");
		driver.manage().window().maximize();
		Thread.sleep(2000);

		WebElement doubleclickButton = driver.findElement(By.xpath("//button[text()='Double-Click Me To See Alert']"));
		// actions class use
		Actions at = new Actions(driver);
		//at.doubleClick().perform();
		at.moveToElement(doubleclickButton).doubleClick().build().perform();
		
	}

}
