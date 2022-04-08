package asserts_in_testNG;

import org.testng.Assert;
import org.testng.annotations.Test;

public class Assert_Fail {
	@Test
	public void Assertfail() {
		
		boolean result = false;
		
		Assert.assertFalse(result, "result is true");
	}
}
