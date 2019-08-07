package LoginVtiger;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class LoginVtiger {
	
	@FindBy(id="username")
	private WebElement unTB;
	
	@FindBy(name="password")
	private WebElement psw;
	
	@FindBy(xpath="//button[text()='Sign in']")
	private WebElement signin;
	
	public LoginVtiger(WebDriver driver) {
		PageFactory.initElements(driver, this);
	  }
	
	    public void setuserName(String un) {
		unTB.sendKeys(un);
	     }
		
	    public void setPwTB(String pw) {
			psw.sendKeys(pw);
	     }		
	    public void clickLogin() {
		signin.click();
		 }
			
	}


