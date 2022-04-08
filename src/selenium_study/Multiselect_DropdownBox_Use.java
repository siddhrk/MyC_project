package selenium_study;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class Multiselect_DropdownBox_Use {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "D:\\My Selenium app\\chromedriver_win32\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("https://demoqa.com/select-menu");
		driver.manage().window().maximize();
		Thread.sleep(1000);
		// 1.Identify list box to be handled and store it in reference variable

		WebElement MultiselectBox = driver.findElement(By.id("cars"));

		// 2.Create an object of Select class which will accept WebElement as argument
		// do only if there is select class otherwise don't

		Select s = new Select(MultiselectBox);

		boolean result = s.isMultiple();
		System.out.println("multiple check is " + result);

		// System.out.println("is multiple select is "+ s.isMultiple());

		// 3. By using one of the select class methods we can select values from list
		// box like

		s.selectByValue("volvo");
		Thread.sleep(500);
		s.selectByIndex(1);
		Thread.sleep(2000);
		s.selectByVisibleText("Opel");
		s.selectByVisibleText("Audi");
		Thread.sleep(1000);

		s.deselectByIndex(3);
		Thread.sleep(1000);

		s.deselectAll();

		driver.close();
	}

}
