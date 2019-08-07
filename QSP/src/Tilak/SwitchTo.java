package Tilak;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class SwitchTo {
	static {
		System.setProperty("webdriver.chrome.driver", "./driver/chromedriver.exe");
		
	}
	public static void main(String[] args) throws InterruptedException {
		WebDriver d=new ChromeDriver();
		d.get("http://www.naukri.com");
		Thread.sleep(4000);
		d.getWindowHandles();
		Thread.sleep(4000);
		WebDriver e = d.switchTo().window("amazan");
		Thread.sleep(1000);
		
		d.quit();
		
		
	}

}
