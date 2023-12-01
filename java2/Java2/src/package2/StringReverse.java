package package2;
import java.util.*;
public class StringReverse {

	public static void main(String[] args) {
		System.out.println("enter string");
		Scanner sc =new Scanner(System.in);
		String input = sc.nextLine();
		
		char []charArr= input.toCharArray();
		
		for (int i=charArr.length-1;i>=0;i--) {	
		
			System.out.println(charArr[i]);
		}

	}

}
