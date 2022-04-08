package asserts_in_testNG;

import org.testng.Assert;
import org.testng.annotations.Test;

public class Assert_Null_Study {
  @Test
  public void Assert_Null() {
	  
	  String a = "VCTC";
	  
	  Assert.assertNull(a,"a is not null");
	  
  }
  
}
