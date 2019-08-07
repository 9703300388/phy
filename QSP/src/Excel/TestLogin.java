package Excel;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

import org.apache.poi.EncryptedDocumentException;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.ss.usermodel.WorkbookFactory;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import Encapsulation.LoginPage;

public class TestLogin {
	static {
		System.setProperty("webdriver.chrome.driver","./driver/chromedriver.exe");
	}
	public static void main(String[] args) throws EncryptedDocumentException, FileNotFoundException, IOException {
		String path = "./data/Book1.xlsx";
		Workbook wb =WorkbookFactory.create(new FileInputStream(path));
		String un = wb.getSheet("sheet1").getRow(0).getCell(0).toString();
		String pw = wb.getSheet("sheet1").getRow(1).getCell(0).toString();
		
		WebDriver driver=new ChromeDriver();
		driver.get("http://localhost/login.do");
		LoginPage l=new LoginPage(driver);
		l.setUserName(un);
		l.setPwTB(pw);
		l.clickLogin();
		driver.close();
		
	}

}
