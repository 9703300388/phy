package Loginmultiple;

import java.util.List;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Loginpagemultiple {
	//Declaration
		
		@FindBy(xpath="//a")
		private List<WebElement> allLinks;
		
		//initialization
		public Loginpagemultiple(WebDriver driver) {
			PageFactory.initElements(driver, this);			
		}
		
		//utilization
		public void getallLinks() {
			int count=allLinks.size();
			System.out.println(count);
		}
			
	    


}
