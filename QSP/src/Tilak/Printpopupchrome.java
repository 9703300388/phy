package Tilak;

import java.awt.AWTException;
import java.awt.Robot;
import java.awt.event.KeyEvent;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Printpopupchrome {
	static {
		System.setProperty("webdriver.chrome.driver","./driver/chromedriver.exe");
	}
	public static void main(String[] args) throws InterruptedException, AWTException{
		WebDriver driver=new ChromeDriver();
		driver.get("http://www.google.com");
		
		//press ctrl+p
		Thread.sleep(1000);
		Robot r=new Robot();
		r.keyPress(KeyEvent.VK_CONTROL);
		r.keyPress(KeyEvent.VK_P);
		r.keyRelease(KeyEvent.VK_CONTROL);
		
		//press TAB 3times
		Thread.sleep(1000);
		for(int i=1;i<=3;i++) {
			r.keyPress(KeyEvent.VK_TAB);
			Thread.sleep(500);
		}
		
		//click on  cancel
		r.keyPress(KeyEvent.VK_DOWN);
		Thread.sleep(500);
		r.keyPress(KeyEvent.VK_ESCAPE);
		r.keyPress(KeyEvent.VK_ESCAPE);
		
				
	}



}
