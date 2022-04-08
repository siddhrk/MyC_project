package selenium_study;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class My_First_Selenium_Code {

	public static void main(String[] args) {

		System.setProperty("webdriver.chrome.driver", "D:\\My Selenium app\\chromedriver_win32\\chromedriver.exe");

		WebDriver driver =new ChromeDriver();
		driver.get("https://www.flipkart.com/");
	}

}
