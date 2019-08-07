package script;

import org.testng.annotations.Test;

import ganaric.BaseTest;
import ganaric.XL;
import page.Loginpage1;

public class login extends BaseTest {
	@Test
	public void login() throws Exception {
		String un = XL.getDate(XL_PATH, "sheet1", 0, 0);
		String pw =XL.getDate(XL_PATH, "sheet1", 0, 1);
		Loginpage1 c=new Loginpage1(driver);
		c.setUsername(un);
		c.setPassword(pw);
		c.Login();
		Thread.sleep(2000);
		c.Logout();
		
	}
	

}
