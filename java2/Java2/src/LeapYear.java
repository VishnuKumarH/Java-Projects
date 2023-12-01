import java.util.*;
import java.util.GregorianCalendar;
public class LeapYear {

	public static void main(String[] args) {
		System.out.println("enter year");
		Scanner sc = new Scanner(System.in);
		int year = sc.nextInt();
		GregorianCalendar gc = new GregorianCalendar();
		
		if(gc.isLeapYear(year)) {
			System.out.printf("IT IS LEAP YEAR",year);
			
		}else {
			System.out.printf("not leap year",year);
		}
	}

}
