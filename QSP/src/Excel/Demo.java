package Excel;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

import org.apache.poi.EncryptedDocumentException;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.ss.usermodel.WorkbookFactory;

public class Demo {
	public static void main(String[] args) throws EncryptedDocumentException, FileNotFoundException, IOException {
		String path="./Data/Book1.xlsx";
		//open xl file
		Workbook wb=WorkbookFactory.create(new FileInputStream(path));
		//READ goto sheet1->
		 String v=wb.getSheet("sheet1").getRow(0).getCell(0).toString();
		 System.out.println(v);
		 int rc=wb.getSheet("sheet1").getLastRowNum();
		 System.out.println(rc);
		 wb.getSheet("sheet1").getRow(0).getCell(0).setCellValue("QSP");
		 wb.write(new FileOutputStream(path));
		 wb.close();
	}

}
