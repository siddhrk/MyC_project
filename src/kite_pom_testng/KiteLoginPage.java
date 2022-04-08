package kite_pom_testng;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class KiteLoginPage {

	//1.variable declaration>>webelement
	
	 @FindBy (id="userid") private WebElement UserID;
	 @FindBy (id="password") private WebElement Password;
	 @FindBy (xpath="//button[@type='submit']") private WebElement LoginButton;
	 
	//2.use of constructor
	 
	 public KiteLoginPage(WebDriver driver) {
		 
		 PageFactory.initElements(driver, this);
	 }
	//3.methods
	 
	 public void senduserid(String uid) {
		 
		 UserID.sendKeys(uid);
	 }
	
	public void sendpassword(String PWD) {
		Password.sendKeys(PWD);
	}
	
	public void clickOnLoginButton() {
		LoginButton.click();
	}
	
	
	
	
}
