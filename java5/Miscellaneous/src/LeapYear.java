import java.util.GregorianCalendar;
import java.util.Scanner;
import java.util.StringTokenizer;

public class LeapYear {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String input = sc.next();
		StringTokenizer tk = new StringTokenizer(input,"/");
		int day;
		int month;
		int year;
		
		while(tk.hasMoreTokens()) {
			 day=Integer.parseInt(tk.nextToken());
			 month =Integer.parseInt(tk.nextToken());
			 year = Integer.parseInt(tk.nextToken());
		
		GregorianCalendar gc = new GregorianCalendar();
		
		if(gc.isLeapYear(year)) {
			System.out.println("true");
		}else {
			System.out.println("false");
		}
		
		
	}

}
}