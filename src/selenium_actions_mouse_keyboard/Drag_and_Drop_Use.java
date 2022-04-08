package selenium_actions_mouse_keyboard;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class Drag_and_Drop_Use {

	public static void main(String[] args) throws InterruptedException {
		 System.setProperty("webdriver.chrome.driver", "D:\\My Selenium app\\chromedriver_win32\\chromedriver.exe");
	     WebDriver driver=new ChromeDriver();
	     driver.get("https://qavbox.github.io/demo/dragndrop/");
	     driver.manage().window().maximize();
	     Thread.sleep(1000);
	     
	     WebElement from = driver.findElement(By.id("draggable")); //inspect>>find the element from where u want to drag @source
	     WebElement to = driver.findElement(By.id("droppable")); // and drop where u want @target
	     
	     Actions act =new Actions(driver); 
	     
	//     act.dragAndDrop(from, to).perform();
	     
	     Thread.sleep(2000);
	     
	     act.clickAndHold(from).moveToElement(to).release().build().perform(); //we can also do this
	     
	     driver.close();

	}

}
