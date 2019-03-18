package script;

import org.apache.poi.sl.usermodel.Sheet;
import org.testng.Assert;
import org.testng.Reporter;
import org.testng.annotations.Test;

import generic.AutoLib;
import generic.BaseTest;
import generic.XL;

public class Demo extends BaseTest {
	@Test
	public void testDemoA() {
		String v=XL.getData(XL_PATH, "Sheet1", 0, 0);
		Reporter.log(v, true);
		int rc=XL.getRowCount(XL_PATH, "sheet1");
		Reporter.log("rowcount"+rc, true);
	  AutoLib.getPhoto(driver,IMG_PATH+"qsp.png");
	  // Assert.fail();
	}

}
