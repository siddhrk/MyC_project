package selenium_study;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Frame2 {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "D:\\My Selenium app\\chromedriver_win32\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		 driver.get("https://vctcpune.com/selenium/practice.html");
		 driver.manage().window().maximize();
		 Thread.sleep(1000);
		 
		  driver.switchTo().frame("courses-iframe");
		  Thread.sleep(2000);
		  driver.findElement(By.xpath("(//a[text()='About us'])[1]")).click();
		  
		  driver.switchTo().defaultContent();
		  Thread.sleep(2000);
		  driver.findElement(By.xpath("//input[@value='Radio1']")).click();
		  
	}

}
