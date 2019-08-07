package ganaric;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.BeforeMethod;



public class BaseTest implements Const{
	public WebDriver driver;
	static {
		System.setProperty(CHROME_KEY, CHROME_VALUE);
	}
	@BeforeMethod
	public void openApp() {
		driver=new ChromeDriver();
		driver.get(APP_URL);
		driver.manage().timeouts().implicitlyWait(IMW, TimeUnit.SECONDS);
		driver.manage().window().maximize();
	}
	

}
