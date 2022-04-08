package Base_Classes;

import java.io.IOException;
import java.time.Duration;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.testng.Reporter;

import utilityPackage.UtilityUsingPropertyFile;

public class BaseUsingPropertyfile {

	protected WebDriver driver;

	public void launchBrowser() throws  IOException {

		Reporter.log("launching browser", true);
		
		System.setProperty("webdriver.chrome.driver", "D:\\My Selenium app\\chromedriver_win32\\chromedriver.exe");
		ChromeOptions opt = new ChromeOptions();
		opt.addArguments("--disable-notifications");

		driver = new ChromeDriver(opt);
		driver.get(UtilityUsingPropertyFile.getDataFromPropertyFile("URL")); //get url from MyFile.properties
		
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofMillis(1000));
		Reporter.log("launched browser successed", true);
	}

	public void closeBrowser() {
		driver.quit();
		Reporter.log("close browser successfully", true);
	}

}
