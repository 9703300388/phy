package Encapsulation;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Testlogin2 {
	static {
		System.setProperty("webdriver.chrome.driver","./driver/chromedriver.exe");
	}
public static void main(String[] args) throws InterruptedException {
	WebDriver driver=new ChromeDriver();
	driver.get("http://localhost/login.do");
	LoginPage l=new LoginPage(driver);
	
	l.setUserName("abcd");
	l.setPwTB("djflk");//invalid psw
	l.clickLogin();
	
	Thread.sleep(1000);
	
	l.setUserName("admin");
	l.setPwTB("manager");//invalid psw
	l.clickLogin();

	
}

}
