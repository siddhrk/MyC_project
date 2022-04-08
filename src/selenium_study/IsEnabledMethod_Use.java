package selenium_study;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class IsEnabledMethod_Use {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub

		System.setProperty( "webdriver.chrome.driver", "D:\\My Selenium app\\chromedriver_win32\\chromedriver.exe");
		 WebDriver x=new ChromeDriver();
		 x.get("https://auth.discoveryplus.in/login?flow=OTPLogin");
		 x.manage().window().maximize();
		 Thread.sleep(2000);
		 
		// x.findElement(By.xpath("//input[@id='mobileNumber']")).sendKeys("9999999999");
		 
		 WebElement GetOTPButton = x.findElement(By.xpath("//button[text()='Get OTP']"));
		 
		 boolean result = GetOTPButton.isEnabled();
		 System.out.println("GetOTPButton status is "+result);
		 
		 if(result) {
			 System.out.println("Get OTP Button is enabled");
			 GetOTPButton.click();
		 }
		 else {
			 x.findElement(By.id("mobileNumber")).sendKeys("8888888888");
			 Thread.sleep(1000);
			 GetOTPButton.click();
			 System.out.println("Clicked on get OTP button");
		 }
		 
		 

	}

}


