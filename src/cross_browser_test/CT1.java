package cross_browser_test;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

public class CT1 {
	@Parameters("browserName")

	@Test
	public void CrossBrowser(String browserName) {

		WebDriver driver = null;
		if (browserName.equals("chrome")) {
			System.setProperty("webdriver.chrome.driver", "D:\\My Selenium app\\chromedriver_win32\\chromedriver.exe");
			driver = new ChromeDriver();

		} else if (browserName.equals("firefox")) {
			System.setProperty("webdriver.gecko.driver",
					"D:\\My Selenium app\\geckodriver-v0.30.0-win64\\geckodriver.exe");
			driver = new FirefoxDriver();
		}

		driver.get("https://www.youtube.com/");

	}
}