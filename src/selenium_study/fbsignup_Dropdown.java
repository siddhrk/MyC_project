package selenium_study;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class fbsignup_Dropdown {

	public static void main(String[] args) throws InterruptedException {
		
		System.setProperty("webdriver.chrome.driver", "D:\\My Selenium app\\chromedriver_win32\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		
		driver.get("https://www.facebook.com/");
		Thread.sleep(2000);
		driver.manage().window().maximize();
		Thread.sleep(2000);
		driver.findElement(By.xpath("//a[text()='Create New Account']")).click();
		Thread.sleep(1000);

		driver.findElement(By.xpath("//input[@name='firstname']")).sendKeys("sid");
		driver.findElement(By.xpath("//input[@name='lastname']")).sendKeys("kokate");
		Thread.sleep(1000);
		driver.findElement(By.xpath("//input[@name='reg_email__']")).sendKeys("sidkokate89@gmail.com");
		Thread.sleep(1000);

		driver.findElement(By.xpath("//input[@name='reg_email_confirmation__']")).sendKeys("sidkokate89@gmail.com");
		Thread.sleep(1000);
		driver.findElement(By.xpath("//input[@name='reg_passwd__']")).sendKeys("Sidkokate@7890");
		Thread.sleep(2000);

		WebElement dob = driver.findElement(By.id("day"));
		Select s = new Select(dob);
		s.selectByVisibleText("5");
		Thread.sleep(1000);

		WebElement mob = driver.findElement(By.id("month"));
		Select m = new Select(mob);
		m.selectByVisibleText("Dec");
		Thread.sleep(1000);

		WebElement yob = driver.findElement(By.name("birthday_year"));
		Select y = new Select(yob);
		y.selectByValue("1995");
		Thread.sleep(2000);

		driver.findElement(By.xpath("//label[text()='Male']")).click();
		Thread.sleep(1000);
		driver.findElement(By.xpath("(//button[text()='Sign Up'])[1]")).click();

		driver.close();

		
		
		
		
		
		
		
		
		
	}

}
