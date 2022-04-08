package utilityPackage;

import java.io.File;
import java.io.FileInputStream;
 
import java.io.IOException;
  
import java.util.Properties;

import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.io.FileHandler;
import org.testng.Reporter;

public class UtilityUsingPropertyFile {

	public static void takesScreenshot(WebDriver driver, int TCID) throws IOException {

		File source = ((TakesScreenshot) driver).getScreenshotAs(OutputType.FILE);
		File dest = new File("D:\\Selenium Screenshots\\TC" + TCID + "Screenshot.png");
		FileHandler.copy(source, dest);
		Reporter.log("screenshot taken for TC " + TCID, true);

	}

	public static String getDataFromPropertyFile(String key) throws  IOException {
		Properties pro = new Properties();
		FileInputStream file = new FileInputStream(
				"C:\\Users\\shidd\\eclipse-workspace\\Velocity_Automation_Testing_Core_Java\\MyFile.properties");
		pro.load(file);
		String value = pro.getProperty(key);
		return value;

	}

}
