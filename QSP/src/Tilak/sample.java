package Tilak;

import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class sample {
	static
	{
		System.setProperty("webdriver.chrome.driver", "./driver/chromedriver.exe");
	}
	
	public static void main(String[] args)
	{
		WebDriver driver=new ChromeDriver();
		driver.get("file:///C:/Users/Tilak/Desktop/sample.html");
		  WebElement e = driver.findElement(By.tagName("a"));
		  e.click();
		  driver.navigate().back();
		  driver.findElement(By.id("a1")).click();
		  driver.navigate().back();
		  driver.findElement(By.name("n1")).click();
		  driver.navigate().back();
		  driver.findElement(By.className("c1")).click();
		 
		  
		  
		 
	
	}

}
