package EncapsulationTest;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class Testself {
	static {
		System.setProperty("webdriver.chrome.driver","./driver/chromedriver.exe");}
	public static void main(String[] args) {
		WebDriver driver=new ChromeDriver();
		driver.get("http://localhost/login.do");
		selflogin l=new selflogin(driver);
		l.setUserName("admin");
		l.setPwTB("manager");//valid psw
		l.clickLogin();
		Actions a =new Actions(driver);
		a.moveToElement(driver.findElement(By.xpath("//a[text()='Logout']")));
		logoutself lo=new logoutself(driver);
		lo.clicklogout();
		
		
	}

}
