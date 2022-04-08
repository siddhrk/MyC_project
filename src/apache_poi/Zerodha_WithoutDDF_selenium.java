package apache_poi;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Zerodha_WithoutDDF_selenium {

	public static void main(String[] args) throws InterruptedException {

		System.setProperty("webdriver.chrome.driver", "D:\\My Selenium app\\chromedriver_win32\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("https://kite.zerodha.com/");
		driver.manage().window().maximize();
		Thread.sleep(1000);
		
		WebElement userid = driver.findElement(By.id("userid"));
		WebElement password = driver.findElement(By.id("password"));
	 WebElement LoginButton = driver.findElement(By.xpath("//button[@type='submit']"));
		
		userid.sendKeys("IRV179");
		password.sendKeys("siddhrk@3028");
		LoginButton.click();
		Thread.sleep(1000);
		
		driver.findElement(By.id("pin")).sendKeys("844695");
		driver.findElement(By.xpath("//button[@type='submit']")).click();
		Thread.sleep(2000);
		
		// now on Zerodha site
		WebElement MyUserid = driver.findElement(By.xpath("//span[@class='user-id']"));
		
		String ActualUserid = MyUserid.getText();
		String ExpectedUserid="IRV179";
		
		if(ActualUserid.equals(ExpectedUserid)) 
		{
			System.out.println("userid matched test case passed");
		}
		else {
			System.out.println("userid not matched TC failed");
		}
		
		MyUserid.click();
		Thread.sleep(1000);
		WebElement LogoutButton = driver.findElement(By.xpath("//a[@target='_self']"));
		LogoutButton.click();
		
//		Thread.sleep(4000);
//		driver.close();
		
	}

}
