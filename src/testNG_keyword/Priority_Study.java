package testNG_keyword;

import org.testng.Reporter;
import org.testng.annotations.Test;

public class Priority_Study {
	
	@Test(priority=1)
	  public void a() {
		  Reporter.log("running method a",true);
	  }
	  @Test(priority=2)
	  public void b() {
		  Reporter.log("running method b",true);
	  }
	  @Test(priority=-1)
	  public void c() {
		  Reporter.log("running method c",true);
	  }
}
