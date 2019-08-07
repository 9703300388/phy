package Tilak;

import java.text.SimpleDateFormat;
import java.time.LocalDate;
import java.util.Date;

public class TodaysDate {
	static {
		System.setProperty("webdriver.chrome.driver","./driver/chromedriver.exe");
	}
	public static void main(String[] args) {
		Date d = new Date();
		String s=d.toString();
		System.out.println(d);
		
		//to get date format
		SimpleDateFormat s1= new SimpleDateFormat("yyyy-MMM-dd");
		
		//to get after two days date
		 LocalDate v=LocalDate.now();
		System.out.println(v.toString());
		System.out.println(v.plusDays(2));
		System.out.println(v.plusDays(-32));
		
		
		
		
	}


}
