package testNG_study;

import org.testng.Reporter;
import org.testng.annotations.Test;

public class test1 {
  @Test
  public void MyMethod1() {
	  System.out.println("welcome to testNG1");
  }
  @Test
  public void MyMethod2() {
	  System.out.println("welcome to testNG2");
	  Reporter.log("welcome to testNG2", true); //report.log use to show msg in report
	  //true again it will show in console
  }
}
