package testNG_study;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Reporter;
import org.testng.annotations.Test;

public class Open_Sites {
  @Test
  public void facebook() 
  {
	  System.setProperty("webdriver.chrome.driver", "D:\\My Selenium app\\chromedriver_win32\\chromedriver.exe");
	  WebDriver driver=new ChromeDriver();
	  driver.get("https://www.facebook.com/");
	  driver.manage().window().maximize();
	  driver.close();
  }
  
  @Test
  public void zerodha() 
  {
	  System.setProperty("webdriver.chrome.driver", "D:\\My Selenium app\\chromedriver_win32\\chromedriver.exe");
	  WebDriver driver=new ChromeDriver();
	  driver.get("https://kite.zerodha.com/");
	  driver.manage().window().maximize();
	  driver.close();
  }
  
  @Test
  public void google( ) {
	  
	  System.setProperty("webdriver.chrome.driver", "D:\\My Selenium app\\chromedriver_win32\\chromedriver.exe");
	  WebDriver driver=new ChromeDriver();
	  driver.get("https://www.google.com/");
	  driver.manage().window().maximize();
	  driver.close();
  }
  
  @Test
  public void Netflix() {
	  
	  System.setProperty("webdriver.chrome.driver", "D:\\My Selenium app\\chromedriver_win32\\chromedriver.exe");
	  WebDriver driver=new ChromeDriver();
	  driver.get("https://www.netflix.com/in/");
	  driver.manage().window().maximize();
	  
	  System.out.println("welcome to netflix");
	  Reporter.log("welcome to netflix");
	  driver.close();
  }
  
  
  
}
