package testNG_keyword;

import org.testng.Reporter;
import org.testng.annotations.Test;

public class DependsOn_Annotation_Study {

	@Test(dependsOnMethods = { "c" })
	public void a() {
		Reporter.log("running a method", true);
	}

	@Test
	public void c() throws InterruptedException {

		Reporter.log("running c method", true);
	}

	@Test
	public void b() {
		Reporter.log("running b method", true);
	}
}
