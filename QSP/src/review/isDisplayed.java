package review;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class isDisplayed {
	static {
		System.setProperty("webdriver.chrome.driver", "./driver/chromedriver.exe");
	}
	public static void main(String[] args) {
		WebDriver driver= new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("http://localhost/login.do");
		WebElement un = driver.findElement(By.id("username"));
		if(un.isDisplayed()) {
			System.out.println("username textBox is Displayed");
		}
		else {
			System.out.println("user textbos is not dispalyed");
		}
	}


}
