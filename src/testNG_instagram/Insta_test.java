package testNG_instagram;

import java.io.FileInputStream;
import java.io.IOException;
import java.time.Duration;

import org.apache.poi.EncryptedDocumentException;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.WorkbookFactory;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.testng.Reporter;
import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import insta_testng.InstaLoginPage;
import insta_testng.Insta_HomePage;

public class Insta_test {

	WebDriver driver;
	InstaLoginPage login;
	Sheet MySheet;
	Insta_HomePage home;

	@BeforeClass
	public void launchBrowser() throws EncryptedDocumentException, IOException {
		Reporter.log("launching Browser", true);
		System.setProperty("webdriver.chrome.driver", "D:\\My Selenium app\\chromedriver_win32\\chromedriver.exe");
		ChromeOptions opt = new ChromeOptions();
		opt.addArguments("--disable-notifications");
		driver = new ChromeDriver(opt);

		driver.get("https://www.instagram.com/");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofMillis(1000));
		Reporter.log("launched browser successed", true);

		FileInputStream myfile = new FileInputStream("D:\\ExcelSheet_apachepoi\\insta.xlsx");
		MySheet = WorkbookFactory.create(myfile).getSheet("Sheet1");

		login = new InstaLoginPage(driver);
		home = new Insta_HomePage(driver);

	}

	@BeforeMethod
	public void loginToInsta() {
		String USERID = MySheet.getRow(0).getCell(0).getStringCellValue();
		String PASSWORD = MySheet.getRow(0).getCell(1).getStringCellValue();

		login.senduserid(USERID);
		login.sendpassword(PASSWORD);
		login.clickonlogin();
		driver.manage().timeouts().implicitlyWait(Duration.ofMillis(2000));

	}

	@AfterMethod
	public void LogoutFromInsta() {
		Reporter.log("logging out...", true);
		home.logout();

	}

	@AfterClass
	public void closeBrowser() {

		Reporter.log("Closing Browser", true);
		driver.close();

	}

}
