package countimages;

import java.util.List;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class CountImages {
	
	@FindBy(xpath="//img")
	private List<WebElement> allImages ;
	
	public CountImages(WebDriver driver) {
		PageFactory.initElements(driver, this);
	}
	
	public void getallImages() {
		int count =allImages.size();
		System.out.println(count);
	}

}
