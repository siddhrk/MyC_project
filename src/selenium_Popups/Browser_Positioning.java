package selenium_Popups;

import java.awt.Point;
import java.awt.geom.Point2D;

import org.openqa.selenium.Dimension;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Browser_Positioning {

	public static void main(String[] args) throws InterruptedException {

		System.setProperty("webdriver.chrome.driver", "D:\\My Selenium app\\chromedriver_win32\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("https://skpatro.github.io/demo/links/");
		driver.manage().window().maximize();
		Thread.sleep(2000);

		// To get default size
		System.out.println(driver.manage().window().getSize());
		Dimension defaultsize = driver.manage().window().getSize();
		Thread.sleep(2000);

		// to set size create an object of Dimension class which will accept width and
		// height

		Dimension d = new Dimension(900, 600);

		// us method setSize which will accept object of Dimension class
		driver.manage().window().setSize(d);

		System.out.println(driver.manage().window().getSize());
		
		//to get default position	
		System.out.println(driver.manage().window().getPosition());
		//1. to change position create object of Point class which will accept x and y co-ordinates 
		Point p= new Point(5, 2);
		//2. use SetPosition which will accept object of point class
	//driver.manage().window().setPosition(p);

	}

}
