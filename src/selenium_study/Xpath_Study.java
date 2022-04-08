package selenium_study;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Xpath_Study {

	public static void main(String[] args) {
		 System.setProperty( "webdriver.chrome.driver", "D:\\My Selenium app\\chromedriver_win32\\chromedriver.exe");
		 WebDriver x=new ChromeDriver();
		 x.get("https://vctcpune.com/selenium/practice.html");
 x.findElement(By.xpath("//a[text()='Velocity Corporate Training Center']")); 
	}

}
