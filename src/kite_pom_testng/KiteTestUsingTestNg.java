package kite_pom_testng;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.time.Duration;

import org.apache.poi.EncryptedDocumentException;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.WorkbookFactory;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.testng.Assert;
import org.testng.Reporter;
import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class KiteTestUsingTestNg {

	WebDriver driver;
	KiteLoginPage login;
	KitePinPage pin;
	KiteHomePage home;
	Sheet Mysheet;

	@BeforeClass
	public void launchBrowser() throws EncryptedDocumentException, IOException {
		Reporter.log("launching Browser", true);
		System.setProperty("webdriver.chrome.driver", "D:\\My Selenium app\\chromedriver_win32\\chromedriver.exe");
		ChromeOptions opt= new ChromeOptions();
		opt.addArguments("--disable-notifications");
		driver = new ChromeDriver(opt);

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
		driver.manage().timeouts().implicitlyWait(Duration.ofMillis(2000));
		
		Reporter.log("performing actions on dashboard",true);
		
		home.Dashboard();
		
		Reporter.log("dashboard actions done",true);

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
		 //home.clickOnMyuserid();
		// home.ClickOnLogout();

	}

	@AfterClass
	public void closeBrowser() {

		Reporter.log("Closing Browser", true);
		//driver.close();
	}

}
