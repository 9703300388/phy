package review;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class isEnable {
	static {
		System.setProperty("webdriver.chrome.driver", "./driver/chromedriver.exe");
	}
	@Test
	public static void main(String[] args) {
		WebDriver driver= new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("file:///C:/Users/Tilak/Desktop/Login.html");
		WebElement pw = driver.findElement(By.id("t2"));
		if(pw.isDisplayed()) {
			System.out.println("pwd textbox is Enabled");
		}
		else {
			System.out.println("pwd textbo is not dispalyed");
		}
		WebElement chkBOX=driver.findElement(By.xpath("//input[@type='chekbox']"));
		//chkBOX.click();
		if(chkBOX.isSelected()) {
			System.out.println("true");
		}
		else {
			System.out.println("false");
		}
		
	}

}
