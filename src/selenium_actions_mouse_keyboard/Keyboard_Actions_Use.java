package selenium_actions_mouse_keyboard;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class Keyboard_Actions_Use {

	public static void main(String[] args) throws InterruptedException {
		
		 System.setProperty("webdriver.chrome.driver", "D:\\My Selenium app\\chromedriver_win32\\chromedriver.exe");
	     WebDriver driver=new ChromeDriver();
	     driver.get("https://en-gb.facebook.com/");
	     driver.manage().window().maximize();
	     Thread.sleep(2000);
	     
	     driver.findElement(By.xpath("(//a[@role='button'])[2]")).click();
	     Thread.sleep(2000);
	     WebElement day = driver.findElement(By.id("day"));
	     Actions act =new Actions(driver);
	     act.click(day).perform(); //click on day field
	     Thread.sleep(2000);
	     
	     for(int i=0;i<=3;i++) {
	    	 act.sendKeys(Keys.ARROW_DOWN).perform();
	    	 Thread.sleep(200);
	     }
	     
	     Thread.sleep(1000);
	     
	    for(int i=0;i<=5;i++) {
	    act.sendKeys(Keys.ARROW_UP).perform();
	    Thread.sleep(200);
	    }
	     
	     
	     
	}

}
