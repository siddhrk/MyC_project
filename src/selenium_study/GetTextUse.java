package selenium_study;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class GetTextUse {

	public static void main(String[] args) {
		System.setProperty( "webdriver.chrome.driver", "D:\\My Selenium app\\chromedriver_win32\\chromedriver.exe");
		 WebDriver x=new ChromeDriver();
		 
		 x.get("https://vctcpune.com/");
		 x.manage().window().maximize();
		// x.findElement(By.xpath("//p[contains(text(),'To build an ideal')]"));
		 
		 WebElement webe =x.findElement(By.xpath("//p[contains(text(),'To build an ideal')]"));
		 String Actualtext = webe.getText();
		 System.out.println("text is "+Actualtext);
		 String Expectedtext = webe.getText();
		 
		 if(Actualtext.equals(Expectedtext)) {
			 System.out.println("text is matching ,tc is passed");
		 }
		 else {
			System.out.println("text is not matching ,tc is failed"); 
		 }

	}

}
