package selenium_scrolling;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class ClickUsing_ActionsClass {

	public static void main(String[] args) throws InterruptedException {
		
		System.setProperty("webdriver.chrome.driver", "D:\\My Selenium app\\chromedriver_win32\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();

		driver.get("https://vctcpune.com/selenium/practice.html");
		driver.manage().window().maximize();
		Thread.sleep(2000);

		WebElement checkBox1 = driver.findElement(By.id("checkBoxOption1"));

		JavascriptExecutor js = (JavascriptExecutor) driver;
		js.executeScript("arguments[0].scrollIntoView()", checkBox1);
		Thread.sleep(3000);

		// 1. Create an object of Actions class which will accept driver object as an
		// argument
		Actions act = new Actions(driver);

		// 2. using ACtions class object call required method, then use perform method
		// 1st way
		act.click().perform();

		// 2nd way
		act.moveToElement(checkBox1).click().build().perform();

	}

}
