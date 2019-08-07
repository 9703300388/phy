package Encapsulation;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class LoginPage {
	//Declaration
	@FindBy(id="username")
	private WebElement unTB;
	
	final String p="pwd";
	@FindBy(name=p)
	private WebElement PwTB;
	
	@FindBy(xpath="//div[text()='Login ']")
	private WebElement loginBTN;
	
	//initialization
	public LoginPage(WebDriver driver) {
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
