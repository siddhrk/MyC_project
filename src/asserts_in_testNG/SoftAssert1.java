package asserts_in_testNG;

import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;

public class SoftAssert1 {

	SoftAssert soft = new SoftAssert(); // created object of soft assert class

	@Test
	public void MyMethod() {
		String a = "Pune";
		String b = "Pune";

		soft.assertNotNull(b, "b is null");
		soft.assertNotEquals(a, b, "a and b are not equal");

		soft.assertAll();

	}

	@Test
	public void MyMethod1() {
		String m = "1nanded";
		String n = "nanded";

		soft.assertNotNull(m, "m is null");
		soft.assertEquals(m, n, "m and n are not equal");

		soft.assertAll();

	}
	
	@Test
	public void MyMethod2() {
		String m = "sid";
		String n = "sidk";

		soft.assertNotNull(m, "m is null");
		soft.assertEquals(m, n, "m and n are not equal");

		soft.assertAll();
		
		
	}	
}