package Tilak;

import java.util.Set;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class AutoscriptActitime {
	static {
		System.setProperty("webdriver.chrome.driver","./driver/chromedriver.exe");
	}
public static void main(String[] args) {
	  WebDriver driver = new ChromeDriver();
	  String parent=driver.getWindowHandle();
	  System.out.println(parent);
	  
	  driver.manage().timeouts().implicitlyWait(10,TimeUnit.SECONDS);
	  driver.get("http://localhost/login.do");
	  driver.findElement(By.id("licenseLink")).click();
	  Set<String> allWHL = driver.getWindowHandles();
	  System.out.println(allWHL);
	  driver.close();
	  
	  
	  
	   
	  
	  
}
}

