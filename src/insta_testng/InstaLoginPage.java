package insta_testng;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.Test;

public class InstaLoginPage {
   
	@FindBy (xpath="//input[@name='username']") private WebElement userid;
	@FindBy(xpath="//input[@name='password']") private WebElement password;
	@FindBy(xpath="//div[text()='Log In']")private WebElement loginbutton;
	
	
	public InstaLoginPage(WebDriver driver) {
		PageFactory.initElements(driver, this);
	}
	
	public void senduserid(String uid) {
		userid.sendKeys(uid);
	}
	
	public void sendpassword(String pwd) {
		password.sendKeys(pwd);
	}
	
	
	public void clickonlogin() {
		loginbutton.click();
	}
	
	
	
	
	
	
	
	
	
}
