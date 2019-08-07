package ganaric;

import java.io.FileInputStream;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.ss.usermodel.WorkbookFactory;

public class XL implements Const  {
	
	public static String getDate(String path, String sheet,int r,int cl) throws Exception {
		String v = "";
		try {
		Workbook wb = WorkbookFactory.create(new FileInputStream(XL_PATH));
		v=wb.getSheet(sheet).getRow(r).getCell(cl).toString();
		}
		catch (Exception e) {
		e.printStackTrace();
		}
		return v;
		
		
	}

}
