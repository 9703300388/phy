package Tilak;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class pageLoad {
	static {
		System.setProperty("webdriver.chrome.driver", "./driver/chromedriver.exe");
	}
	public static void main(String[] args) {
		WebDriver d=new ChromeDriver();
		d.manage().timeouts().pageLoadTimeout(3, TimeUnit.SECONDS);
		try {
		d.get("http://www.google.com");
		System.out.println("with is 3 sec");
		}
		catch(Exception e) {
			System.out.println("after 3 sec");
			
		}
		
	}

}
