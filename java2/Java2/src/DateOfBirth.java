import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Scanner;
import java.text.ParseException;
import java.text.ParsePosition;
public class DateOfBirth {

	public static void main(String[] args)throws ParseException {
         System.out.println("enter date in dd/mm/yyy");
         Scanner sc = new Scanner(System.in);
         String input = sc.nextLine();
         java.util.Date dOB = new Date();
         SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyy");
         
        // sdf.setLenient(false);
         
         dOB = sdf.parse(input);
         SimpleDateFormat sdf2 = new SimpleDateFormat("EEEE");
         System.out.println(dOB);
         System.out.println(sdf2.format(dOB));
         
	}

}