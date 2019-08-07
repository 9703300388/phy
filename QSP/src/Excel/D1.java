package Excel;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

import org.apache.poi.EncryptedDocumentException;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.ss.usermodel.WorkbookFactory;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class D1 {
	static {
		System.setProperty("webdriver.chrome.driver", "./driver/chromedriver.exe");
	}
	public static void main(String[] args) throws EncryptedDocumentException, FileNotFoundException, IOException {
		WebDriver driver=new ChromeDriver();
		String path="./Data/Book1.xlsx";
		Workbook d=new WorkbookFactory().create(new FileInputStream(path));
		String un = d.getSheet("sheet1").getRow(0).getCell(0).toString();
		String pw = d.getSheet("sheet1").getRow(1).getCell(0).toString();
		
		driver.get("http://localhost/login.do");
		driver.findElement(By.xpath("//input[@name='username']")).sendKeys(un);
		driver.findElement(By.xpath("//input[@name='pwd']")).sendKeys(pw);
		driver.findElement(By.xpath("//div[text()='Login ']")).click();
		
	}

}
