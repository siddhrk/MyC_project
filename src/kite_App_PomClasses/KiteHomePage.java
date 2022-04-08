package kite_App_PomClasses;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class KiteHomePage {

	@FindBy(xpath="//span[@class='user-id']")private WebElement myuserid;
	@FindBy(xpath="//a[@target='_self']")private WebElement logout;
	
	
	public KiteHomePage(WebDriver driver) {
		PageFactory.initElements(driver, this);
	}
	
	public String getActualUserID() {
		
		String Actualuserid = myuserid.getText();
		return Actualuserid;
				
	}
	
	public void clickOnMyuserid() throws InterruptedException {
		myuserid.click();
		Thread.sleep(1000);
	}
	
	public void ClickOnLogout() {
		logout.click();
	}
	
}
