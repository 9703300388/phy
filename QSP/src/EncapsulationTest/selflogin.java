package EncapsulationTest;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class selflogin {
	@FindBy(id="username")
	private WebElement unTB;
	
	final String p="pwd";
	@FindBy(name=p)
	private WebElement PwTB;
	
	@FindBy(xpath="//div[text()='Login ']")
	private WebElement loginBTN;
	
	
	
	//initialization
	public selflogin(WebDriver driver) {
		PageFactory.initElements(driver, this);			
	}
	
	//utilization
	public void setUserName(String un) {
		unTB.sendKeys(un);
	}
		
     public void setPwTB(String pw) {
			PwTB.sendKeys(pw);

	}
     public void clickLogin() {
 		loginBTN.click();
     }
     
     
    	 
     

}
