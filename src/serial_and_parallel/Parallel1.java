package serial_and_parallel;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class Parallel1 {
	@Test
	  public void MyMethod() throws InterruptedException {
		  
		  System.setProperty("webdriver.chrome.driver", "D:\\My Selenium app\\chromedriver_win32\\chromedriver.exe");
			WebDriver driver = new ChromeDriver();

			driver.get("https://www.youtube.com/");
			driver.manage().window().maximize();
			Thread.sleep(2000);
			driver.close();
		  
		  
		  
	  }
}
