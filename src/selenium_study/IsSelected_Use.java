package selenium_study;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class IsSelected_Use {

	public static void main(String[] args) throws InterruptedException {
		 System.setProperty("webdriver.chrome.driver", "D:\\My Selenium app\\chromedriver_win32\\chromedriver.exe");
		 WebDriver driver =new ChromeDriver();
		  driver.get("https://vctcpune.com/selenium/practice.html");
		  driver.manage().window().maximize();
		  
		  WebElement checkBoxOption1 = driver.findElement(By.id("checkBoxOption1"));
		   //System.out.println(Option1CheckBox.isSelected());
		  
		  boolean result = checkBoxOption1.isSelected();
		  
		  if(result) {
			  System.out.println("checkBox is already selected");
		     }
		  else {
			  System.out.println("checkBox is not selected ,selecting checkBox now");
			  
			  checkBoxOption1.click();
			  Thread.sleep(2000);
			  boolean result2 = checkBoxOption1.isSelected();
			  
			  System.out.println("Updated checkBox selected status is "+result2);
			  
		  }
			  
		  
		  
		  
		 

	}

}
