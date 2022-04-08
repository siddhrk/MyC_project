package selenium_study;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class WebElement_Methods_Use {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "D:\\My Selenium app\\chromedriver_win32\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.facebook.com/");
		driver.manage().window().maximize();
		
	   WebElement username = driver.findElement(By.id("email"));
	   username.sendKeys("8888888888");
	   Thread.sleep(2000);
	   username.clear();
	   username.sendKeys("suhas189@gmail.com");
	   
	   driver.findElement(By.xpath("//button[@type='submit']")).click();
	   
	   WebElement text = driver.findElement(By.xpath("//h2[text()='Facebook helps you connect and share with the people in your life.']"));
	   text.getText();
	   System.out.println("text is "+text);
	   
//	   Thread.sleep(1000);
//	  text.clear();

	}

}
   class  isEnabled {
	 public static void main(String[] args) {
		 System.setProperty("webdriver.chrome.driver", "D:\\My Selenium app\\chromedriver_win32\\chromedriver.exe");
			WebDriver driver = new ChromeDriver();
			driver.get("https://vctcpune.com/selenium/practice.html");
			driver.manage().window().maximize();
			
			WebElement enable = driver.findElement(By.xpath("//input[@value='Radio1']"));
			
			 System.out.println(enable.isEnabled());
			System.out.println(enable.isDisplayed());
			
			 
				
			}
			
	}
 