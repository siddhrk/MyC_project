package selenium_study;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Locators_study {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty( "webdriver.chrome.driver", "D:\\My Selenium app\\chromedriver_win32\\chromedriver.exe");
		 WebDriver dr=new ChromeDriver();
		 dr.get("https://www.facebook.com/");
		 dr.manage().window().maximize();
		 Thread.sleep(2000);
		// dr.findElement(By.className("inputtext _55r1 _6luy")).sendKeys("1234");//if compound class then never use it. // Use it in case of plain text
		 dr.findElement(By.id("email")).sendKeys("suhas1@gmail.com");
		 dr.findElement(By.name("email")).clear();
		 dr.findElement(By.tagName("button")).click();
		 Thread.sleep(1000);
		 dr.findElement(By.linkText("Forgotten password?")).click();
		 Thread.sleep(1000);
		 dr.findElement(By.partialLinkText("password?")).click();
		 

	}

}
