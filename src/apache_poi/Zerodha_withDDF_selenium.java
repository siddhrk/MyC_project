package apache_poi;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

import org.apache.poi.EncryptedDocumentException;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.WorkbookFactory;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Zerodha_withDDF_selenium {

	public static void main(String[] args) throws InterruptedException, EncryptedDocumentException, IOException {

		FileInputStream file = new FileInputStream("D:\\ExcelSheet_apachepoi\\Zerodha.xlsx");
		Sheet MySheet = WorkbookFactory.create(file).getSheet("Sheet1");
		String UserID = MySheet.getRow(0).getCell(0).getStringCellValue();

		String Password = MySheet.getRow(0).getCell(1).getStringCellValue();
		String Pin = MySheet.getRow(0).getCell(2).getStringCellValue();

		// System.out.println(Pin);

		System.setProperty("webdriver.chrome.driver", "D:\\My Selenium app\\chromedriver_win32\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("https://kite.zerodha.com/");
		driver.manage().window().maximize();
		Thread.sleep(1000);

		WebElement userid = driver.findElement(By.id("userid"));
		WebElement password = driver.findElement(By.id("password"));
		WebElement LoginButton = driver.findElement(By.xpath("//button[@type='submit']"));

		userid.sendKeys(UserID);
		password.sendKeys(Password);
		LoginButton.click();
		Thread.sleep(2000);

		WebElement MyPin = driver.findElement(By.id("pin"));
		WebElement ClickContinue = driver.findElement(By.xpath("//button[@type='submit']"));

		MyPin.sendKeys(Pin);
		ClickContinue.click();
		Thread.sleep(2000);
		// now on Zerodha site
		WebElement MyUserid = driver.findElement(By.xpath("//span[@class='user-id']"));

		String ActualUserid = MyUserid.getText();
		String ExpectedUserid = UserID;

		if (ActualUserid.equals(ExpectedUserid)) {
			System.out.println("userid matched test case passed");
		} else {
			System.out.println("userid not matched TC failed");
		}

		MyUserid.click();
		Thread.sleep(1000);
		WebElement LogoutButton = driver.findElement(By.xpath("//a[@target='_self']"));
		LogoutButton.click();

	}

}
