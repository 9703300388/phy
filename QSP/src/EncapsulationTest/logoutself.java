package EncapsulationTest;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class logoutself {
	@FindBy(xpath="//a[text()='Logout']")
	private WebElement logoutBTN;
	
	public logoutself(WebDriver driver) {
		PageFactory.initElements(driver, this);	
	}
		
		public void clicklogout() {
	    	 logoutBTN.click();
	}

}
