package asserts_in_testNG;

import org.testng.Assert;
import org.testng.annotations.Test;

public class Assert_Not_Null {
  @Test
  public void Assert_notNull() {
	  String a = null;
	  
	  Assert.assertNotNull(a,"a is null");
	  
  }
}
