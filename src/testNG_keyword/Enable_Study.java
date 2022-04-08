package testNG_keyword;

import org.testng.Reporter;
import org.testng.annotations.Test;

public class Enable_Study {
  @Test
  public void a() {
	  Reporter.log("running method a",true);
  }
  @Test
  public void b() {
	  Reporter.log("running method b",true);
  }
  @Test(enabled=false)
  public void c() {
	  Reporter.log("running method c",true);
  }
}
