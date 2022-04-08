package selenium_Popups;

import java.util.Iterator;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class ChildBrowser_popup {

	public static void main(String[] args) throws InterruptedException {
		
		System.setProperty("webdriver.chrome.driver", "D:\\My Selenium app\\chromedriver_win32\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		
		driver.get("https://skpatro.github.io/demo/links/");
		driver.manage().window().maximize();
		Thread.sleep(2000);
		
		String mainpagewindoID = driver.getWindowHandle();
		System.out.println("main page window id id "+mainpagewindoID);
		
		driver.findElement(By.name("NewWindow")).click(); // opening child browser popup
		
		Set<String> allWindowsID = driver.getWindowHandles();
		System.out.println("all windows id are "+allWindowsID);
		
		Iterator<String> it = allWindowsID.iterator(); //pointing to -1
		String mainpageID = it.next();  //pointing to 0th location
		String childpageID = it.next(); //pointing to 1st location
		Thread.sleep(2000);
		
		//switch selenium focus to child page 
		driver.switchTo().window(childpageID); //focused switched form main page to child page
		Thread.sleep(2000);
		driver.manage().window().maximize();
		Thread.sleep(2000);
		driver.findElement(By.xpath("//input[@id='the7-search']")).sendKeys("My_Selenium");
		Thread.sleep(2000);
		
		driver.close();
		
		
		
		
		
		
		
		
	}

}
