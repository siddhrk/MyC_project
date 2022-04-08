package asserts_in_testNG;

import org.testng.Assert;
import org.testng.annotations.Test;

public class Assert_NotEqual_Study {
	@Test
	public void AssertTest() {
		String name = "VCTC";
		String name1 = "VCTC";

		Assert.assertNotEquals(name, name1, "Strings are matching");
	}
}
