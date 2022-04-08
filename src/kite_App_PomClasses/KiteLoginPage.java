package kite_App_PomClasses;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class KiteLoginPage {

	  @FindBy(id="userid") private WebElement UserID;
	 @FindBy (id="password") private WebElement Password;
	 @FindBy (xpath="//button[@type='submit']") private WebElement LoginButton;
	 
	 @FindBy (xpath="//span[contains(text(),'User ID should be minimum')]")private WebElement UseridErrorMsg;
 @FindBy(xpath="//span[contains(text(),'Password')]")private WebElement passwordErrorMsg;

	 public KiteLoginPage(WebDriver driver) {
		 PageFactory.initElements(driver, this);
	 }
	 
	 public void enterUserid(String uid) {
		 
		 UserID.sendKeys(uid);
	 }
	
	public void enterpassword(String PWD) {
		Password.sendKeys(PWD);
	}
	
	public void clickOnLoginButton() {
		LoginButton.click();
	}
	public String getActualPassword() {
		String ActualPassword = Password.getText();
		return ActualPassword;
	}
	public String UseridErrorMsg() {
		String errorMsg = UseridErrorMsg.getText();
		return errorMsg;
	}
	public String passwordErrorMsg() {
		String errormsg = passwordErrorMsg.getText();
		return errormsg;
	}
	
	
}
