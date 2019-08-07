package tuesday;

import org.testng.Reporter;
import org.testng.annotations.Test;

public class DemoB extends BaseTest {
	@Test
	public void testB1() {
		Reporter.log("@B1",true);
	 
	}
	@Test
	public void testB2() {
		Reporter.log("@B2",true);
	 
	}



}
