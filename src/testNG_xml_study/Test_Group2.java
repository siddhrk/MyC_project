package testNG_xml_study;

import org.testng.Reporter;
import org.testng.annotations.Test;

public class Test_Group2 {
	
	@Test(groups = "Regression")
	public void TC1() {
		Reporter.log("Running TC1", true);
	}

	@Test
	public void TC2() {
		Reporter.log("Running TC2", true);
	}

	@Test
	public void TC3() {
		Reporter.log("Running TC3", true);
	}

	@Test(groups = "Sanity")
	public void TC4() {
		Reporter.log("Running TC4", true);
	}

	@Test(groups = "Regression")
	public void TC5() {
		Reporter.log("Running TC5", true);
	}
}
