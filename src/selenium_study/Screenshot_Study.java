package selenium_study;

import java.io.File;
import java.io.IOException;

import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.io.FileHandler;

public class Screenshot_Study {

	public static void main(String[] args) throws IOException, InterruptedException {
		System.setProperty("webdriver.chrome.driver", "D:\\My Selenium app\\chromedriver_win32\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.youtube.com/");
		driver.manage().window().maximize();
		Thread.sleep(2000);
		
	  File source = ((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE); //stored in temporary memory
	  
	  System.out.println("source path is "+source);
	  File destination = new File("D:\\My Selenium app\\Screenshot\\myscreenshot.png"); 
	  
	  //- To store screenshot in local drive (desired location ), we need to call a method 
	 // i-e. copy file () which is present inside fileHandler class.

	 // FileHandler.copy(source, destination);
	
	  
	  
	  

	}

}
