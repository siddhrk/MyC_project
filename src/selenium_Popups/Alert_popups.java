package selenium_Popups;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Alert_popups {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "D:\\My Selenium app\\chromedriver_win32\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("https://demoqa.com/alerts");
		driver.manage().window().maximize();
		Thread.sleep(1000);

		driver.findElement(By.xpath("//button[@id='alertButton']")).click();

		Alert alt = driver.switchTo().alert(); // switched selenium focus to alert popup
		Thread.sleep(2000);
		System.out.println("text on alert popup is " + alt.getText());

		alt.accept();

		driver.findElement(By.xpath("//button[@id='timerAlertButton']")).click();
		Thread.sleep(6000);
		Alert alt2 = driver.switchTo().alert();
		alt2.accept();
		
		
		
		
	}

}
