package selenium_Popups;

import java.util.Iterator;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class childbrowser_vel {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "D:\\My Selenium app\\chromedriver_win32\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		
		driver.get("https://vctcpune.com/selenium/practice.html");
		Thread.sleep(2000);
		driver.manage().window().maximize();
		Thread.sleep(2000);
		
		String mainpage = driver.getWindowHandle();
		System.out.println("main page window ID is "+mainpage);
		
		driver.findElement(By.id("opentab")).click(); //go to child browser popup
	 
		Set<String> allwindowsID = driver.getWindowHandles();
		System.out.println("all windows is are "+allwindowsID);
		
		Iterator<String> it = allwindowsID.iterator();
		mainpage = it.next();
		 String childpageID = it.next();
		 Thread.sleep(2000);
		 
		//switch selenium focus to child page 
driver.switchTo().window(childpageID);
		driver.findElement(By.xpath("(//a[text()='Courses'])[1]")).click(); 
		 Thread.sleep(2000);
		 driver.close();
		 
		 driver.switchTo().window(mainpage);
		 Thread.sleep(2000);
		 driver.findElement(By.xpath("//input[@value='Radio1']")).click();
		 Thread.sleep(1000);
		 driver.findElement(By.xpath("//input[@placeholder='Type to Select Countries']")).sendKeys("Pune");
		 
		 WebElement dropdown = driver.findElement(By.xpath("//select[@name='dropdown-class-example']"));
		 
		 Select s=new Select(dropdown);
		 s.selectByValue("option2");
		 Thread.sleep(2000);
		 driver.findElement(By.name("checkBoxOption1")).click();
		 Thread.sleep(2000);
		 driver.close();
		 
		 
	}

}
