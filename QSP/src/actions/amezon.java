

package actions;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class amezon {
	static {
		System.setProperty("webdriver.chrome.driver", "./driver/chromedriver.exe");
	}
	public static void main(String[] args) throws InterruptedException {
		WebDriver driver=new ChromeDriver();
		driver.get("https://www.amazon.com/");
		Actions a =new Actions(driver);
		WebElement element = driver.findElement(By.xpath("//a[@class='nav-a nav-a-2'][1]"));
		a.moveToElement(element).perform();
		Thread.sleep(1000);
		driver.findElement(By.xpath("//span[text()='Sign in'][1]")).click();
		Thread.sleep(1000);
		driver.findElement(By.xpath("//input[@type='email']")).sendKeys("thilakbabu123@gmail.com");
		Thread.sleep(1000);
		driver.findElement(By.xpath("//input[@type='password']")).sendKeys("Lucky1432");
		Thread.sleep(1000);
		driver.findElement(By.xpath("//input[@type='checkbox']")).click();
		Thread.sleep(1000);
		driver.findElement(By.xpath("//input[@id='signInSubmit']")).click();
		//driver.close();
	}

}
