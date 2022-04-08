package kite_App_PomClasses;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class KitePinPage {

	@FindBy(id="pin")private WebElement Pin;
	@FindBy(xpath="//button[@type='submit']") WebElement ContinueButton;
	
	public KitePinPage(WebDriver driver) {
		PageFactory.initElements(driver, this);
	}
	
	public void enterPin(String PIN) {
		Pin.sendKeys(PIN);
	}
	
	public void clickOnContinueButton() {
		ContinueButton.click();
	}
	
	
	
	
}
