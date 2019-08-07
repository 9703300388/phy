package Tilak;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class XpathDemo {
	static {
		System.setProperty("webdriver.chrome.driver","./driver/chromedriver.exe");
	}
	public static void main(String[] args) {
		WebDriver driver=new ChromeDriver();
		driver.get("http://127.0.0.1/login.do;jsessionid=bc8e9kyn6dlp");
		//driver.findElement(By.xpath("//input/*[type='text']//*[name='username']*")).sendKeys("tilak");
		  	}
  
}
