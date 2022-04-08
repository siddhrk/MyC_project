package kite_pom_testng;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class KiteHomePage {

	@FindBy (xpath="//span[@class='user-id']") private WebElement Myuserid;
	@FindBy (xpath="//a[@target='_self']") private WebElement Logout;
	
	@FindBy(xpath="//span[text()='Dashboard']")private WebElement dashboard;
	@FindBy(xpath="//span[@class='nickname']")private WebElement clientName;
	@FindBy(xpath="(//span[text()='View statement'])[1]")private WebElement viewStatement;
	//@FindBy(xpath="//h3[text()='0.01']")private WebElement Balance;
	
	@FindBy (xpath="//input[@type='text']")private WebElement search;
	@FindBy(xpath="//span[@class='last-price']")private WebElement lastprice;
	
	public KiteHomePage(WebDriver driver) {
		PageFactory.initElements(driver, this);
	}
	
	public String getActualUserID() {
		
		String Actualuserid = Myuserid.getText();
		return Actualuserid;
				
	}
	
	public void Dashboard() {
		dashboard.click();
		System.out.println(clientName.getText());
		viewStatement.click();
		//Balance.getText();
		search.sendKeys("ONGC");
		System.out.println(lastprice.getText());
	}
	
	public void clickOnMyuserid() {
		Myuserid.click();
	}
	
	public void ClickOnLogout() {
		Logout.click();
	}
	
}
