package kiteAppTestClasses;

import java.io.IOException;
 
import org.bouncycastle.oer.its.Duration;
import org.openqa.selenium.WebDriver;
import org.testng.Assert;
import org.testng.Reporter;
import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import Base_Classes.BaseUsingPropertyfile;
import kite_App_PomClasses.KiteHomePage;
import kite_App_PomClasses.KiteLoginPage;
import kite_App_PomClasses.KitePinPage;
import utilityPackage.UtilityUsingPropertyFile;

public class KIteUsernameValidation_PropertiesFile extends  BaseUsingPropertyfile {

	 
	KiteLoginPage login;
	KitePinPage Pin;
	KiteHomePage home;
	
	@BeforeClass
	public void launchingBrowser() throws  IOException {
		launchBrowser();
		login = new KiteLoginPage(driver);
		Pin = new KitePinPage(driver);
		home = new KiteHomePage(driver);

	}

	@BeforeMethod
	public void LoginToKiteApp() throws   IOException {
		driver.manage().timeouts().implicitlyWait(java.time.Duration.ofMillis(1000));

		 login.enterUserid(UtilityUsingPropertyFile.getDataFromPropertyFile("UN"));
		
		login.enterpassword(UtilityUsingPropertyFile.getDataFromPropertyFile("PWD"));
		login.clickOnLoginButton();
		driver.manage().timeouts().implicitlyWait(java.time.Duration.ofMillis(1000));

		Pin.enterPin(UtilityUsingPropertyFile.getDataFromPropertyFile("PIN"));
		Pin.clickOnContinueButton();
		driver.manage().timeouts().implicitlyWait(java.time.Duration.ofMillis(1000));
	}

	@Test
	public void ValidateUserID() throws   IOException {
		int TCID = 10;
		
		String expectedUserID = UtilityUsingPropertyFile.getDataFromPropertyFile("UN");
		String actualUserID = home.getActualUserID();

		Assert.assertEquals(actualUserID, expectedUserID, "actualand expected UserID not matching");
		UtilityUsingPropertyFile.takesScreenshot(driver, TCID);

	}

	@AfterMethod
	public void LogoutFromKiteApp() throws InterruptedException {
		home.clickOnMyuserid();
		home.ClickOnLogout();

	}

	@AfterClass
	public void closingBrowser() {
		closeBrowser();
	}

}
