package Tilak;

import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class login {
	static
	{
		System.setProperty("webdriver.chrome.driver", "./driver/chromedriver.exe");
	}
	
	public static void main(String[] args)
	{
		WebDriver driver=new ChromeDriver();
		driver.get("http://www.facebook.com");
		  driver.findElement(By.id("email")).sendKeys("thilakbabu123@gmail.com");
		  driver.findElement(By.id("pass")).sendKeys("8897562623");
		 // driver.findElement(By.id("u_0_2")).click();
		  driver.findElement(By.id("u_0_2")).sendKeys(Keys.ENTER);
		 
		  
		  
		 
	
	}

}
