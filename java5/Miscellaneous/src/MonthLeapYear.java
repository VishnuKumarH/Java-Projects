import java.util.GregorianCalendar;
import java.util.Scanner;


public class MonthLeapYear {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int year =sc.nextInt();
		int month = sc.nextInt();
		System.out.println(getDays(year,month));
		
	}
		static int getDays(int year,int month) {
		int days=0;
		if(month==0||month==2||month==4||month ==6||month ==7||month ==9||month ==11) {
			days =31;
		}
		else if (month==3||month==5||month==8||month==10) {
			days =30;
		}
		else {
			GregorianCalendar gc = new GregorianCalendar();
			boolean b= gc.isLeapYear(year);
			
			if(b) {
				days=29;
			}else {
				days =28;
			}
			
			
		}
		return days;
		
		
		}

	}


