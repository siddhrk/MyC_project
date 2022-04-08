package selenium_study;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class Dropdown_Use {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "D:\\My Selenium app\\chromedriver_win32\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("https://vctcpune.com/selenium/practice.html");

		// 1.Identify list box to be handled and store it in reference variable
		WebElement DropdownBox = driver.findElement(By.name("dropdown-class-example"));

		// 2.Create an object of Select class which will accept WebElement as argument
		// do only if there is select class otherwise don't
		Select s = new Select(DropdownBox);

		// 3. By using one of the select class methods we can select values from list
		// box like
//	1. selectByVisibleText: selectByVisibleText(String arg0) 
//	2. selectByIndex: selectByIndex(int arg0) 
//	3. selectByValue: selectByValue(String arg0)

		s.selectByVisibleText("Option3");
		Thread.sleep(1000);
		s.selectByIndex(2);
		Thread.sleep(2000);
		s.selectByValue("option1");

		System.out.println("multiple status is " + s.isMultiple());

		driver.close();

	}

}
