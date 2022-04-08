package asserts_in_testNG;

import org.testng.Assert;
import org.testng.annotations.Test;

public class Asserts_Equals_Study {
  @Test
  public void AssertTest() {
	  
	  String name="VCTC";
	  String name1="VCTC";
	  
	  if(name.equals(name1)) {
		  System.out.println("TC is pass");
	  }
	  else {
		  System.out.println("TC is fail");
	  }
	  
	  Assert.assertEquals(name, name1,"String not matched");
  }
  
}
