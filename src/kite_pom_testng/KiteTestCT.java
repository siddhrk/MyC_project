package kite_pom_testng;

import java.io.FileInputStream;
import java.io.IOException;
import java.time.Duration;

import org.apache.poi.EncryptedDocumentException;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.WorkbookFactory;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.firefox.FirefoxOptions;
import org.testng.Assert;
import org.testng.Reporter;
import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

import com.beust.jcommander.Parameter;

public class KiteTestCT {

	WebDriver driver;
	KiteLoginPage login;
	KitePinPage pin;
	KiteHomePage home;
	Sheet Mysheet;
	@Parameters("browser name")
	@BeforeClass
	public void launchBrowser(String browser) throws EncryptedDocumentException, IOException {
		
		if(browser.equals("chrome")) {
		
		Reporter.log("launching Browser", true);
		System.setProperty("webdriver.chrome.driver", "D:\\My Selenium app\\chromedriver_win32\\chromedriver.exe");
		ChromeOptions opt= new ChromeOptions();
		opt.addArguments("--disable-notifications");
		driver = new ChromeDriver(opt);
		}
		else if(browser.equals("firefox")) {
			Reporter.log("Launching firefox browser",true);
			  System.setProperty("webdriver.gecko.driver", "D:\\My Selenium app\\geckodriver-v0.30.0-win64\\geckodriver.exe");
			
			  FirefoxOptions opt = new FirefoxOptions();
			  opt.addArguments("--disable-notifications");
			  driver = new FirefoxDriver(opt);
			  
			
		}
			
		driver.get("https://kite.zerodha.com/");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofMillis(1000));
		Reporter.log("launched browser successed", true);

		FileInputStream Myfile = new FileInputStream("D:\\ExcelSheet_apachepoi\\Zerodha.xlsx");
		Mysheet = WorkbookFactory.create(Myfile).getSheet("Sheet1");

		login = new KiteLoginPage(driver);
		pin = new KitePinPage(driver);
		home = new KiteHomePage(driver);
		}
	

	@BeforeMethod
	public void LogintoKiteApp() {

		String USERID = Mysheet.getRow(0).getCell(0).getStringCellValue();
		String PWD = Mysheet.getRow(0).getCell(1).getStringCellValue();
		String PIN = Mysheet.getRow(0).getCell(2).getStringCellValue();

		login.senduserid(USERID);

		login.sendpassword(PWD);
		login.clickOnLoginButton();

		driver.manage().timeouts().implicitlyWait(Duration.ofMillis(2000));
		Reporter.log("Entering PIN", true);

		pin.sendpin(PIN);
		pin.clickOnContinueButton();
		driver.manage().timeouts().implicitlyWait(Duration.ofMillis(1000));

	}

	@Test
	public void ValidateUserID() {
		Reporter.log("Validating userid", true);
		String Expected = Mysheet.getRow(0).getCell(0).getStringCellValue();

		String Actualuserid = home.getActualUserID();

		Assert.assertEquals(Expected, Actualuserid, "expected and actual userid not matching");

		Reporter.log("validated userid successfully", true);

	}

	@AfterMethod

	public void LogoutFromKiteApp() {

		Reporter.log("logging out...", true);
		home.clickOnMyuserid();
		home.ClickOnLogout();

	}

	@AfterClass
	public void closeBrowser() {

		Reporter.log("Closing Browser", true);
		driver.close();
	}

}
