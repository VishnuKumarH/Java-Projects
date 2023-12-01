import java.util.Objects;
import java.util.Scanner;
import java.util.*;

public class Country {
	

	
 public static void main(String []args) {
	 Scanner sc = new Scanner(System.in);
	 HashSet <String> country = new HashSet<String>();
	 country.add("japan");
	 country.add("china");
	 country.add("checkloslovakia");
	 String input =sc.nextLine();
	 if(country.contains(input)) {
		 System.out.println("yes is"+input+" present");
	 }else 
		 System.out.println("no"+input+"is not present");
	 
 }
}
