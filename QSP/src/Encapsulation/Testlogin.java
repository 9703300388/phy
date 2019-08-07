//valid login
package Encapsulation;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Testlogin {
	static {
		System.setProperty("webdriver.chrome.driver","./driver/chromedriver.exe");
	}
public static void main(String[] args) {
	WebDriver driver=new ChromeDriver();
	driver.get("http://localhost/login.do");
	LoginPage l=new LoginPage(driver);
	l.setUserName("admin");
	l.setPwTB("manager");//valid psw
	l.clickLogin();
	
}

}
