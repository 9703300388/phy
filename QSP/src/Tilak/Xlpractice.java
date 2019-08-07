package Tilak;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Xlpractice {
	static {
		System.setProperty("webdriver.chrome.driver", "./driver/chromedriver.exe");
	}
   public static void main(String[] args) throws InterruptedException {
	WebDriver driver=new ChromeDriver();
	driver.get("http://www.gmail.com");
	//Thread.sleep(1000);
	driver.close();
}
}
