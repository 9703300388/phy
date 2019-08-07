package actions;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class DoubleClick {
	static {
		System.setProperty("webdriver.chrome.driver", "./driver/chromedriver.exe");
	}
	public static void main(String[] args) throws InterruptedException {
		WebDriver driver=new ChromeDriver();
		driver.get("file:///C:/Users/Tilak/Desktop/doublecliclk.html");
		WebElement dbc = driver.findElement(By.xpath("(//p)[1]"));
		Thread.sleep(1000);
		Actions ac=new Actions(driver);
		ac.doubleClick(dbc).perform();
	}

}
