package asserts_in_testNG;

import static org.testng.Assert.assertEquals;

import org.testng.Assert;
import org.testng.annotations.Test;

public class Assert_True_Study {
  @Test
  public void testing() {
	  
	  boolean result = true;
	  
	  Assert.assertTrue(result,"result is false"); //if true then pass if false then "result is false pass"
	  
  }
  
}
