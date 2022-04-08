package wait_syncronization;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class Explicit_Wait_Use {

	public static void main(String[] args) {

		System.setProperty("webdriver.chrome.driver", "D:\\My Selenium app\\chromedriver_win32\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.discoveryplus.in/");
		driver.manage().window().maximize();
		
		driver.manage().timeouts().implicitlyWait(Duration.ofMillis(5000));
		
		WebElement SignInButton = driver.findElement(By.xpath("(//h6[text()='Sign In'])[2]"));
		SignInButton.click();
		driver.manage().timeouts().implicitlyWait(Duration.ofMillis(500));
		driver.findElement(By.id("mobileNumber")).sendKeys("8888888888");
		WebElement OTPButton = driver.findElement(By.xpath("//button[text()='Get OTP']"));

		// WebDriverWait/ Explicit wait

		// 1.create object of WebDriver wait pass driver and time unit as arguments
		
		WebDriverWait w = new WebDriverWait(driver,Duration.ofMillis(1000));
		w.until(ExpectedConditions.visibilityOf(OTPButton));
		OTPButton.click();

	}
	

}
