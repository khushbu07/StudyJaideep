package Programs.Zz_Basic;

/*
 * Is 2024 gonna be a leap year? 
 * To be a leap year, the year number must be divisible by four – except for end-of-century years, which must be divisible by 400.
 * This means that the year 2000 was a leap year, although 1900 was not. 2020, 2024 and 2028 are all leap years.
 */

public class LeapYear {

	public static void main(String[] args) {

		int year = 2024;
		boolean isLeap = false;

		if(year % 4 == 0) {
			if( year % 100 == 0) {
				if ( year % 400 == 0) {
					isLeap = true;
				} else
					isLeap = false;
			}
			else {
				isLeap = true;
			}
		}
		else {
			isLeap = false;
		}

		if(isLeap==true)
			System.out.println(year + " is a Leap Year.");
		else
			System.out.println(year + " is not a Leap Year.");

	}

}
