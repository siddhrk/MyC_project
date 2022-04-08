package testNG_instagram;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.Test;

public class Insta_HomePage {

	@FindBy(xpath = "//span[@class='_2dbep qNELH']")
	private WebElement Profile;
	@FindBy(xpath = "//div[text()='Log Out']")
	private WebElement Logout;

	public Insta_HomePage(WebDriver driver) {
		PageFactory.initElements(driver, this);
	}

	public void logout() {
		Profile.click();
		Logout.click();
	}

}
