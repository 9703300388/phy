//count of links 
package Tilak;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class Listbox {
	static {
		System.setProperty("webdriver.chrome.driver","./driver/chromedriver.exe");
	}
	public static void main(String[] args)throws InterruptedException {
		WebDriver driver=new ChromeDriver();
		driver.get("http://www.facebook.com");
		WebElement Listbox = driver.findElement(By.id("month"));
		Select select=new Select(Listbox);
		select.selectByIndex(0);
		  	}
  
}
