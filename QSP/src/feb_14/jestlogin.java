package feb_14;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class jestlogin {
	
		static {
			System.setProperty("webdriver.chrome.driver","./driver/chromedriver.exe");
		}
		public static void main(String[] args) throws InterruptedException {
			WebDriver driver=new ChromeDriver();
			driver.get("file:///C:/Users/Tilak/Desktop/Login.html");
			driver.findElement(By.id("t1")).sendKeys("Lucky");
			
			JavascriptExecutor js=(JavascriptExecutor)driver;
			js.executeScript("document.getElementById('t2').value='hello'");
			Thread.sleep(1000);
			driver.findElement(By.xpath("//input[@type='checkbox']")).click();
			Thread.sleep(1000);
					
			//driver.findElement(By.id("t2")).sendKeys("hello"); //it throws exception org.openqa.selenium.InvalidElementStateException
			Thread.sleep(1000);
			driver.close();
			}
	

}
