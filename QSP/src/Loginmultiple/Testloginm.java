package Loginmultiple;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Testloginm {
	static {
		System.setProperty("webdriver.chrome.driver","./driver/chromedriver.exe");
	}
public static void main(String[] args) throws InterruptedException {
	WebDriver driver=new ChromeDriver();
	driver.get("http://localhost/login.do");
	Loginpagemultiple v=new Loginpagemultiple(driver);
    v.getallLinks();
 }
}
