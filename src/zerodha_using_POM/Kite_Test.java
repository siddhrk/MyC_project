package zerodha_using_POM;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Kite_Test {

	public static void main(String[] args) throws InterruptedException {

		System.setProperty("webdriver.chrome.driver", "D:\\My Selenium app\\chromedriver_win32\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();

		driver.get("https://kite.zerodha.com/");
		driver.manage().window().maximize();
		Thread.sleep(1000);

		KiteLoginPage login = new KiteLoginPage(driver);
		login.sendUserID();
		login.sendPassword();
		login.clickOnLoginButton();
		Thread.sleep(1000);
		
		KitePinPage pin = new KitePinPage(driver);
		pin.sendPin();
		pin.ClickOnContinueButton();
		Thread.sleep(1000);
		
		Kite_HomePage home = new Kite_HomePage(driver);
		home.ValidateUserID();
		home.clickOnUserID();
		home.clickOnLogoutButton();
				

	}

}
