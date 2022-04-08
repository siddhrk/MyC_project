package kiteAppTestClasses;

import java.io.IOException;
import java.time.Duration;

import org.apache.poi.EncryptedDocumentException;
import org.openqa.selenium.WebDriver;
import org.testng.Assert;
import org.testng.Reporter;
import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import Base_Classes.Base;
import kite_App_PomClasses.KiteHomePage;
import kite_App_PomClasses.KiteLoginPage;
import kite_App_PomClasses.KitePinPage;
import utilityPackage.Utility;

public class KiteUsernameValidation extends Base {

	KiteLoginPage login;
	KitePinPage pin;
	KiteHomePage home;

	@BeforeClass
	public void browserLaunch() {
		launchBrowser();
		login = new KiteLoginPage(driver);
		pin = new KitePinPage(driver);
		home = new KiteHomePage(driver);
	}

	@Test (priority=3)
	public void validateUsername() throws EncryptedDocumentException, IOException {
		int TCID = 100;
		driver.manage().timeouts().implicitlyWait(Duration.ofMillis(1000));
		login.enterUserid(Utility.readDataFromExcel(0, 0));
		login.enterpassword(Utility.readDataFromExcel(0, 1));
		login.clickOnLoginButton();
		
		pin.enterPin(Utility.readDataFromExcel(0, 2));
		pin.clickOnContinueButton();
		String ActualUserid = home.getActualUserID();
		String ExpectedUserid = Utility.readDataFromExcel(0, 0);
		Assert.assertEquals(ActualUserid, ExpectedUserid, "ActualUserid and ExpectedUserid not matching");

		Utility.takesScreenshot(driver, TCID);
		Reporter.log("validated UserId successfully", true);
		driver.manage().timeouts().implicitlyWait(Duration.ofMillis(1000));
	}

	

	@Test (priority=2)
	public void validateUseridErrorMsg() throws EncryptedDocumentException, IOException {
		
		login.enterpassword(Utility.readDataFromExcel(0, 1));
		login.clickOnLoginButton();
		int TCID = 101;
		driver.manage().timeouts().implicitlyWait(Duration.ofMillis(1000));
		
		String actualuid = login.UseridErrorMsg();
		String expecteduid = Utility.readDataFromExcel(0, 3);
		Assert.assertNotEquals(expecteduid, actualuid, "actualuid and expecteduid matching");

		Utility.takesScreenshot(driver, TCID);
		driver.manage().timeouts().implicitlyWait(Duration.ofMillis(1000));
	}
	@Test (priority=1)
	public void validatePasswordError() throws EncryptedDocumentException, IOException {
		int TCID = 102;
		login.enterUserid(Utility.readDataFromExcel(0, 0));
		login.clickOnLoginButton();
		
		driver.manage().timeouts().implicitlyWait(Duration.ofMillis(1000));
		String ActualPassword = login.passwordErrorMsg();
		String ExpectedPassword = Utility.readDataFromExcel(0, 4);
		Assert.assertEquals(ExpectedPassword, ActualPassword, "ActualPassword and ExpectedPassword not matching");

		Utility.takesScreenshot(driver, TCID);
		 
	}

	@AfterMethod
	public void LogoutFromKiteApp() throws InterruptedException {
		 home.clickOnMyuserid();
		home.ClickOnLogout();
	}
	
	@AfterClass
	public void closingBrowser() throws InterruptedException {
	 
		closeBrowser();
	}

}
