package Tilak;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class Selectelements {
	static {
		System.setProperty("webdriver.chrome.driver","./driver/chromedriver.exe");
	}
	public static void main(String[] args) {
		WebDriver driver=new ChromeDriver();
		driver.get("file:///C:/Users/Tilak/Desktop/automate.html");
		WebElement mtrLB= driver.findElement(By.id("mtr"));
		Select select=new Select(mtrLB);
		select.selectByIndex(0);
		select.selectByValue("v");
		select.selectByVisibleText("Dosa");
		select.deselectByIndex(0);
		select.deselectByValue("v");
		select.deselectByVisibleText("Dosa");
		
		WebElement slvLB = driver.findElement(By.id("slv"));
		Select slv=new Select(slvLB);
		System.out.println(slv.isMultiple());
		slv.deselectAll();
		
		WebElement ccdLB = driver.findElement(By.id("ccd"));
		Select ccd=new Select(ccdLB);
		System.out.println(ccd.isMultiple());
		ccd.selectByValue("t");
		ccd.deselectByValue("t");
	}

}
