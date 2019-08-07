package review;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Tagname {
	static {
		System.setProperty("webdriver.driver.chrome", "./driver/chromedriver.exe");
	}
	public static void main(String[] args) {
		WebDriver driver=new ChromeDriver();
		driver.get("http://www.google.com");
		
		WebElement log = driver.findElement(By.id("hplogo"));
		String s=log.getTagName();
		System.out.println(s);
		
		if (s.equals("img")) {
			System.out.println("its image");
		}
		else {
			System.out.println("its not image");
		}
		String q=log.getCssValue("font-family");
		System.out.println(q);
	}

}
