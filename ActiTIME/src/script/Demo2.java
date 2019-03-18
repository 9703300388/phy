package script;

import org.testng.Reporter;
import org.testng.annotations.Test;

import generic.AutoLib;
import generic.BaseTest;

public class Demo2 extends BaseTest {
	@Test
	public void testDemoA() {
	  AutoLib.getPhoto(driver,IMG_PATH+"qsp.png"); 
	  Reporter.log("Demo2", true);
	  // Assert.fail();
	}

}
