package Tilak;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Syscustem {
	static {
		System.setProperty("webdriver.chrome.driver","./driver/chromedriver.exe");
	}
public static void main(String[] args) {
	WebDriver driver=new ChromeDriver();
	driver.get("http://127.0.0.1/login.do;jsessionid=bc8e9kyn6dlp");
	driver.findElement(By.id("username")).sendKeys("admin");
	driver.findElement(By.name("pwd")).sendKeys("manager");
	driver.findElement(By.xpath("div[text()='Login']")).click();
	while(true) {
		try {
			driver.findElement(By.id("logoutLink")).click();
			System.out.println("Logout Link is found & clicked");
			break;
		}
			catch(Exception e) {
				System.out.println("Logout Link is NOT found, will try again");
			}
		}
			
	System.out.println("End");
	
	}
}


