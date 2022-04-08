package zerodha_using_POM;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Kite_HomePage {
//1.variable declaration >>WebElement
	@FindBy(xpath="//span[@class='user-id']") private WebElement UserID;
	@FindBy(xpath="//a[@target='_self']") private WebElement Logout;
	
//2.use of constructor
	public Kite_HomePage(WebDriver driver) {
		PageFactory.initElements(driver, this);
	}
	
//3.methods which work on data members
	
	public void ValidateUserID()
	{
		String ActualUserID = UserID.getText();
		String ExpectedUserID="HD5857";
		
		if(ActualUserID.equals(ExpectedUserID)) {
			System.out.println("userid matched TC passed");
		}
		else {
			System.out.println("userid not matched TC failed");
		}
		
	}
	
	public void clickOnUserID()
	{
		UserID.click();
	}
	
	public void clickOnLogoutButton()
	{
		Logout.click();
	}
	
}
