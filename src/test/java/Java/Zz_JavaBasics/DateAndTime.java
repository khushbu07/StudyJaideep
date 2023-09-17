package Java.Zz_JavaBasics;

import java.text.SimpleDateFormat;
import java.util.Date;

public class DateAndTime {

	public static void main(String[] args) {
		
		Date today = new Date();
		System.out.println("Today is: "+today);
		
		SimpleDateFormat timeFormat = new SimpleDateFormat("hh:mm:ss");
		SimpleDateFormat dateFormat = new SimpleDateFormat("MM/dd/yyy");
		System.out.println("Time format is: "+timeFormat.format(today));
		System.out.println("Date format is: "+dateFormat.format(today));
		
	}

}
