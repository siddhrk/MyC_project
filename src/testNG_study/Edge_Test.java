package testNG_study;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.testng.annotations.Test;

public class Edge_Test {
	@Test
	public void edge_launch() {
		System.setProperty("webdriver.edge.driver", "D:\\My Selenium app\\edgedriver_win64\\msedgedriver.exe");
		WebDriver driver = new EdgeDriver();
		driver.get("https://www.youtube.com/");

	}
}
