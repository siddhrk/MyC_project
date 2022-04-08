package testNG_keyword;

import org.testng.Reporter;
import org.testng.annotations.Test;

public class Invocation_Count_Study {
  @Test(invocationCount=3)
  public void a() {
	  Reporter.log("running method a",true);
  }
  
  @org.testng.annotations.AfterMethod
  public void AfterMethod() {
	  Reporter.log("After Method is running",true);
  }
}
