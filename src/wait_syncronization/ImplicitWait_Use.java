package wait_syncronization;

import java.time.Duration;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class ImplicitWait_Use {

	public static void main(String[] args) {
		
		 System.setProperty("webdriver.chrome.driver", "D:\\My Selenium app\\chromedriver_win32\\chromedriver.exe");
	     WebDriver driver=new ChromeDriver();
	     driver.get("https://www.facebook.com/");
	     driver.manage().window().maximize();
	      
	     driver.manage().timeouts().implicitlyWait(Duration.ofMillis(1000));
	     
	   //implicitlyWait--> Dynamic wait--> applicable for whole webpage
			//1000ms-->10ms page is loaded--> 900ms --> will be released

	}

}
