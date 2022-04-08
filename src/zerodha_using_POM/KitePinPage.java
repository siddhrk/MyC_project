package zerodha_using_POM;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class KitePinPage {
	
//1.variable declaration >>>webelement
	@FindBy(id="pin") private WebElement Pin;
	@FindBy(xpath="//button[@type='submit']") private WebElement ContinueButton;
	
	//2.use constructor >>>public
	public KitePinPage(WebDriver driver)
	{
		PageFactory.initElements(driver, this);
	}
	
	//3.methods which work on data members
	public void sendPin()
	{
		Pin.sendKeys("969696");
	}
	
	public void ClickOnContinueButton()
	{
		ContinueButton.click();
	}
	
	
	
}
