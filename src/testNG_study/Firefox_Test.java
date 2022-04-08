package testNG_study;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.Test;

public class Firefox_Test {
  @Test
  public void MyFirefox() {
	  System.setProperty("webdriver.gecko.driver", "D:\\My Selenium app\\geckodriver-v0.30.0-win64\\geckodriver.exe");
	  WebDriver driver = new FirefoxDriver();
	  driver.get("https://www.youtube.com/");
  }
}
