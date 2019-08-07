// WA script to count the  no.of options selected in the listbox and print all the options which are 
//selected in the list box.
package Tilak;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class Getoption {
	static {
		System.setProperty("webdriver.chrome.driver","./driver/chromedriver.exe");
	}
public static void main(String[] args) {
	 WebDriver driver=new ChromeDriver();
	 driver.get("file:///C:/Users/Tilak/Desktop/automate.html");
	 WebElement slvLB = driver.findElement(By.id("slv"));
	 Select slv=new Select(slvLB);
	 
	 WebElement option = slv.getFirstSelectedOption();
	 String text=option.getText();
	 System.out.println(text);
	
	 List<WebElement> allOption = slv.getOptions();
	 System.out.println(allOption.size());
	 
	 for(WebElement v:allOption) {
		 String t=v.getText();
		 System.out.println(t);
	 }
	 //print listbox options with out using loop

	 WebElement w = slv.getWrappedElement();
	 System.out.println(w.getText());
	 driver.close();
}

}