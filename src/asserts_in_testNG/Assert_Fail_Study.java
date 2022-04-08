package asserts_in_testNG;

import static org.testng.Assert.fail;

import org.testng.Assert;
import org.testng.annotations.Test;

public class Assert_Fail_Study {
  @Test
  public void f() {
	  String a="Pune";
	  String b=null;
	  
	  Assert.assertNotNull(a, "a is null");
	  System.out.println("a is not a null it has Pune");
	  
	  Assert.assertNull(b, "b is not null");
	  System.out.println("b is null");
	  Assert.fail();
	  
  }
}
