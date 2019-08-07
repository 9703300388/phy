package page;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Loginpage1 {
	@FindBy(name="username")
	public WebElement untb;
	
	@FindBy(name="pwd")
	public WebElement pwd;
	
	@FindBy(xpath="//div[text()='Login ']")
	public WebElement Lbn;
	
	@FindBy(xpath="//a[text()='Logout']")
	public WebElement Logo;
	
	 public Loginpage1(WebDriver driver) {
		 PageFactory.initElements(driver, this);	
	}
	 public void setUsername(String un) {
		untb.sendKeys(un); 
	 }
	 public void setPassword(String pw) {
		 pwd.sendKeys(pw);
	 }
	 public void Login() {
		 Lbn.click();
	 }
	 public void Logout() {
		 Logo.click();
	 }
}
