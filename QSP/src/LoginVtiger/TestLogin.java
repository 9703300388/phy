package LoginVtiger;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class TestLogin {
	static {
		System.setProperty("webdriver.chrome.driver","./driver/chromedriver.exe");
	}
	public static void main(String[] args) {
		WebDriver driver=new ChromeDriver();
	   driver.get("https://demo.vtiger.com/vtigercrm/index.php");
	   LoginVtiger lo=new LoginVtiger(driver);
	   lo.setuserName("Tiak");
	   lo.setPwTB("Lucky");
	   lo.clickLogin();
	   
	}

}
