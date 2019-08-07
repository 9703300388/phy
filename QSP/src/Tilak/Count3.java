package Tilak;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Count3 {
	static {
		System.setProperty("webdriver.chrome.driver","./driver/chromedriver.exe");
	}
	public static void main(String[] args) {
		WebDriver driver=new ChromeDriver();
		driver.get("https://www.amazon.com/");
		List<WebElement> allImages = driver.findElements(By.xpath("//img"));
		int count=allImages.size();
		System.out.println(count);
		for(int i=0;i<count;i++)
		{
			WebElement link=allImages.get(i);
			String text=link.getText();
			System.out.println(text);
		}
		driver.close();
		}
	
	}


