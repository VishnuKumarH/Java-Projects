import java.util.Scanner;

public class ColourCode {

	public static void main(String[] args) {
		Scanner sc = new Scanner (System.in);
		String input = sc.next();
		if(input.matches("[#]{1}[A-F 0-9]{6}")) {
			System.out.println("valid");
			
		}else {
			System.out.println("invalid");
		}

	}

}
