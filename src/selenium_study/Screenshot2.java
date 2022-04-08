package selenium_study;

import java.io.File;
import java.io.IOException;

import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.io.FileHandler;

import net.bytebuddy.utility.RandomString;

public class Screenshot2 {

	public static void main(String[] args) throws IOException {
		System.setProperty("webdriver.chrome.driver", "D:\\My Selenium app\\chromedriver_win32\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.youtube.com/");
		driver.manage().window().maximize();
		
		  File source = ((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
		  
		  RandomString name =new RandomString(4); //to avoid overwrite
		  
		  File destination = new File("D:\\My Selenium app\\Screenshot\\myscreenshot"+name+".png");
		  
		FileHandler.copy(source, destination);

		  System.out.println("source path is "+source);
		driver.quit();
		
	}

}
