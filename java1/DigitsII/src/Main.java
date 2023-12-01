import java.util.Scanner;

public class Main {

	public static void main(String[] args) {

		
	      Scanner sc = new Scanner(System.in);
	     String st = sc.next();
	     int input = Integer.parseInt(st);
	     
	     UserMainCode umc = new UserMainCode();
	   int result=  UserMainCode.getDigitSum(input);
	   System.out.println(result);
	     

	}
}

